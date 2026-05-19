#!/usr/bin/env perl
use strict;
use warnings;

my ($results_file, $perf_test, $perf_n) = @ARGV;
die "usage: $0 results.tsv PERF_TEST PERF_N\n" unless $results_file && $perf_test && defined $perf_n;

open my $fh, '<', $results_file or die $!;
my %r;
while (<$fh>) {
  chomp;
  my ($k, $t, $rc) = split /\t/;
  $r{$k} = { t => $t, rc => $rc };
}

for my $k (qw(lamac_i lamac_s truffle)) {
  die "missing $k\n" unless exists $r{$k};
  if ($r{$k}{rc} != 0) {
    print "FAIL: $k exited with $r{$k}{rc}\n";
    exit 1;
  }
}

my $ts = $r{lamac_s}{t};
sub ratio {
  my ($t) = @_;
  return 'n/a' if $ts <= 0;
  return sprintf '%.2f', $t / $ts;
}

print "\n=== Performance: PERF_TEST=$perf_test PERF_N=$perf_n ===\n";
printf "%-16s %12s\n", 'mode', 'time (ms)';
printf "%-16s %12s\n", 'lamac -i', $r{lamac_i}{t};
printf "%-16s %12s\n", 'lamac -s', $r{lamac_s}{t};
printf "%-16s %12s\n", 'truffle (cold)', $r{truffle}{t};
print "\n";

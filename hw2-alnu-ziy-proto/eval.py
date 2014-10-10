#!/usr/bin/env python 

import sys

if __name__ == "__main__":
  answer = open(sys.argv[1])
  gold_ans = {}
  total_line = 0
  for line in answer:
      total_line += 1
      line = line.rstrip().replace("|", " ").split()
      if line[0] not in gold_ans:
         gold_ans[line[0]] = [(line[1], line[2], line[3])]
      else:
	 gold_ans[line[0]].append((line[1], line[2], line[3]))

  outfile = open(sys.argv[2])
  guess = 0
  correct = 0
  for line in outfile:
      line = line.rstrip().replace("|", " ").split()
      #print line
      myans = (line[1], line[2], line[3])
      guess += 1
      if line[0] not in gold_ans:
         continue
      if myans in gold_ans[line[0]]:    
         correct += 1

  precision = float(correct)/float(guess)
  recall = float(correct)/float(total_line)
  f1 = 2 * (precision) * (recall) / (precision + recall)
  print "precision:", precision
  print "recall:", recall
  print "f1:", f1






package com.geeksforgeeks.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

 class Interval {
   int start;
   int end;
   Interval() { start = 0; end = 0; }
   Interval(int s, int e) { start = s; end = e; }
}
public class CheckMergeIntervals {
   
   public boolean canAttendMeetings(Interval[] intervals) {
      Arrays.sort(intervals,new Comparator<Interval>() {
         @Override
         public int compare(Interval interval1, Interval interval2) {

           //ascending order
           return interval1.end-interval2.end;

           //descending order
           //return fruitName2.compareTo(fruitName1);
         }});
      for(int i11=0;i11<intervals.length;i11++)
         System.out.println(intervals[i11].start+"\t"+intervals[i11].end);
      for(int i=0;i<intervals.length-1;i++) {
          if(intervals[i].end<intervals[i].start)
              return false;
      }
      return true;
  }
 public static void main(String args[]) {
    Interval i = new Interval(5,8);
    Interval i1 = new Interval(6,8);
    Interval[] intervals = {i,i1};
    
    CheckMergeIntervals c = new CheckMergeIntervals();
    System.out.println(c.canAttendMeetings(intervals));
    
 }
}     

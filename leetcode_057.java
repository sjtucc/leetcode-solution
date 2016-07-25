package cn.cc.org;

import java.util.ArrayList;
import java.util.List;

class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
public class leetcode_057 {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> ls = new ArrayList<Interval>();
		if(intervals==null || intervals.size()<1) {
			ls.add(newInterval); return ls;}
	
			for(int i=0;i<intervals.size();i++){
				Interval curr = intervals.get(i);
				if(newInterval.end<curr.start){
					ls.add(newInterval);
					// ls.add(curr); //开始多了这句话，wrong answer
					for(int j=i;j<intervals.size();j++){
					ls.add(intervals.get(j));
				}
				break;
				}else if(newInterval.start>curr.end){
					ls.add(curr);
				}else{
					newInterval.start=Math.min(curr.start,newInterval.start);
					newInterval.end=Math.max(curr.end,newInterval.end);
				}
				if(i==intervals.size()-1){
					ls.add(newInterval);
				}
			}
			return ls;
		}
	}
}

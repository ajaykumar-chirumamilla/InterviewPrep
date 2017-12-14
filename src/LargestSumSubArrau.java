
public class LargestSumSubArrau {
	public  int latgestSum(int[] nums) {
		int max_sum = 0, maxso_far = 0;
		for(int i=0;i<nums.length;i++) {
			maxso_far+=nums[i];
			//System.out.println(maxso_far);
			if(maxso_far < 0)
				maxso_far = 0;
			if(maxso_far>max_sum)
				max_sum = maxso_far;
		}
		return max_sum;
	}
	
	public static void main(String arg[]) {
		LargestSumSubArrau l = new LargestSumSubArrau();
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(l.latgestSum(nums));
		String str="struct<name:string,clienttimestamp:bigint,clientposttimestamp:bigint,clientgeneratedtimestamp:bigint,serverreceivedtimestamp:bigint,plugininitialized:struct<playerid:string,playerversion:string,organization:string,frameworkid:string,frameworkversion:string,nativeapplication:boolean,supportsvod:boolean,supportslinear:boolean,supportscdvr:boolean,osid:string,osversion:string,osarch:string,cpufamily:string,cpucores:int,cpuspeed:int,memorytype:string,memoryamount:int,screenwidth:int,screenheight:int>,heartbeat:struct<position:int,positionunit:string,bitrate:bigint,secondaryaudio:string,closedcaptions:string,framerate:int,systemload:float,playerload:float,bandwidthused:float,memoryused:float,buffersize:int,bufferlength:int,fragmentcount:int,fragmentsize:int,fragmentduration:int,fragmentdownloadlatency:int,fragmentdownloadduration:int>,openingmedia:struct<manifesturl:string>,mediaopened:struct<position:int,positionunit:string,latency:int,manifesturl:string>,playbackstarted:struct<position:int,positionunit:string>,mediafailed:struct<errorcode:string,aderror:boolean,errordescription:string,position:int,positionunit:string,manifesturl:string>,mediainfo:struct<position:int,positionunit:string,description:string>,performance:struct<steps:map<string,int>>,bitratechanged:struct<value:int>,frameratechanged:struct<value:int>,playstatechanged:struct<value:string>,adprogress:struct<value:int>,fragmentwarning:struct<fragmenturl:string,fragmentsize:int,fragmentduration:int,fragmentdownloadduration:int,fragmentdownloadlatency:int>,error:struct<errorcode:string,errorclass:string,errordescription:string,aderror:boolean,ext:map<string,string>>,eas:struct<uri:string,uripath:string,action:string,language:string,errorcode:string>,scrubstarted:struct<position:int,positionunit:string>,trickplay:struct<position:int,positionunit:string,trickplaytype:string>,scrubended:struct<position:int,positionunit:string>,bufferevent:struct<buffereventtype:string,state:string,start:bigint,position:int,positionunit:string,aderror:boolean>,downloadevent:struct<audiogroup:string,totalfragments:int,completedfragments:int,failedfragments:int,groupid:string,videoplaylist:string,bandwidth:int,resolution:string,ext:map<string,string>,failures:array<struct<statuscode:int,url:string,offset:int,errorclass:string,errordescription:string>>>>";
		System.out.println(str.length());
	}
}

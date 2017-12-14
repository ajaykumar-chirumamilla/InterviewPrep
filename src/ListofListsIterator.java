import java.util.Iterator;
import java.util.List;

class Position {
   int listNo;
   int index;
   
   public Position(int list, int index) {
      this.listNo = list;
      this.index = index;
   }
   
   public int getList() {
      return listNo;
   }
   
   public int getIndex() {
      return index;
   }
   
   public void setList(int list) {
      listNo = list;
   }
   
   public void setIndex(int index) {
      this.index = index;
   }
}

public class ListofListsIterator implements Iterator<Object> {

   List<List<?>> listOfLists;
   Position pos;
   
   
   public ListofListsIterator(List<List<?>> list) {
      // TODO Auto-generated constructor stub
      listOfLists = list;
      if(!list.isEmpty() && !list.get(0).isEmpty()) {
         pos = new Position(0, 0);
      } else {
         return;
      }
   }
   
   @Override
   public boolean hasNext() {
      // TODO Auto-generated method stub
      int currList = pos.listNo;
      int currIndex = pos.index;
      if(listOfLists.get(currList)!=null && listOfLists.get(currList).get(currIndex+1)!=null)
      return true;
      else if(listOfLists.get(currList+1)!=null && listOfLists.get(currList+1).get(0)!=null)
         return true;
      else return false;
   }

   @Override
   public Object next() {
      // TODO Auto-generated method stub
      int currList = pos.listNo;
      int currIndex = pos.index;
      if(listOfLists.get(currList) != null && listOfLists.get(currList).get(currIndex)!=null) {
         pos.setIndex(currIndex+1);
         if(listOfLists.get(currList).get(currIndex+1) == null) {
            pos.setList(currList+1);
            pos.setIndex(0);
         }
         return listOfLists.get(currList).get(currIndex);
      }
      return -1;
   }

}

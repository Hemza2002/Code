
public class ArrayList
{
    //making my own arrayList array 
    private Object[] arrayList = new Object[100];
     
        //this method adds the object at the specified index and shifts other elements  
        void insert(Object object, int index){
                if(index>size()){
                        System.exit(0);
                }
                int count = 0;
                try {
                        Object[] o = new Object[arrayList.length+1];
                        switch(index){
                    case 0:{
                        o[0] = object;
                        for(int i=1;i<arrayList.length;i++)
                                o[i] = arrayList[i-1];
                        
                        arrayList = o;
                        break;
                    }
                    default: {
                        for(int i=0;i<index;i++)
                                o[i] = arrayList[i];
                        o[index] = object;
                        for(int j=index+1;j<arrayList.length;j++)
                                o[j] = arrayList[j];
                        arrayList = o;
                        break;
                    }
                    }
                }
                catch(ArrayIndexOutOfBoundsException exception) {
                    toString();
                    if(++count == 2){
                        System.exit(0);
                    } 
                }
        }
        
    
        //this method removes and returns the object at the specified index    
        Object remove(int index){
                if(index>size()){
                        
                        System.exit(0);
                }
                Object temp = arrayList[index];
                int count = 0;
                try {
                        Object[] object = new Object[arrayList.length-1];
                        switch(index){
                    case 0:{
                        object[0] = arrayList[1];
                        for(int j=1;j<size();j++)
                                object[j] = arrayList[j+1];
                        
                        arrayList = object;
                        break;
                    }
                    default: {
                        for(int j=0;j<index;j++)
                                object[j] = arrayList[j];
                        for(int k=index;k<size();k++)
                                object[k] = arrayList[k+1];
                        arrayList = object;
                        break;
                    }
                    }
                }
                catch(ArrayIndexOutOfBoundsException exception) {
                    toString();
                    if(++count == 2){
                        System.exit(0);
                    } 
                }
                return temp;
        }
        
           //this method gets the size of the arraylist and returns the size
        public int size(){
                int size = 0;
                for(int i=0;i<arrayList.length;i++){
                        if(arrayList[i]==null)
                            continue;
                        else
                            size++;
                }
                return size;
        }
         
         //this method changes the array to a string and returns it as a string
        public String toString(){
                String string = "";
                for(int i=0;i<size();i++){
                        if(i<size()-1)
                            string += arrayList[i]+", ";
                        else
                            string += arrayList[i];
                }
                return string;
        }
        
        
        
        //this boolean method returns true if there are null elements and returns false if there aren't
        public boolean isEmpty() {
                boolean b = true;
                for (Object element : arrayList) {
                    if(element==null){
                            b = true;
                            break;
                        }
                        else{
                            b = false;
                            break;
                }
                }
                return b;
        }
        
         //this method returns -1 if the index of object is not found
        int indexOf(Object object){
                int index = -1;
                for(int i=0;i<arrayList.length;i++){
                        if(arrayList[i]==(object))
                             index = i;
                        else 
                            continue;
                }
                return index;
        }
        
         //this boolean method compares the sizes and elements in data structure. it returns true if the elements are the same
        public boolean equals(ArrayList o){
                boolean b = false;
                int length = arrayList.length;
                int objectLength = o.arrayList.length;
                if(length > objectLength){
                        for(int i=0;i<arrayList.length;i++)
                                if(arrayList[i] == o.arrayList[i])
                                        b = true;
                                else{
                                        b = false;
                                        break;
                                }
                        }
                        else{
                        for(int i=0;i<o.arrayList.length;i++)
                                if(arrayList[i] == o.arrayList[i])
                                        b = true;
                                else{
                                        b = false;
                                        break;
                                }
                }
                return b;
        }
        //this method returns the object at the index
        Object get(int index){
                return arrayList;
            }
}   


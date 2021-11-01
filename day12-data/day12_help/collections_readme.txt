List<E> features
1. List represents ordered collection --- order is significant(It remembers the order of insertion)
2. Allows null references
3. Allows duplicates
4. Supports index based operation



java.util.ArrayList<E> -- E -- type of ref.
1. ArrayList<E>  -- constructor
API 
ArrayList() -- default constructor. -- creates EMPTY array list object , with init capacity=10,size=0;
eg ---ArrayList<Integer> l1=new ArrayList<>();

1.5 1. ArrayList<E>  -- constructor
API 
public ArrayList(int capacity) -- -- creates EMPTY array list object , with init capacity=capacity,size=0;
eg ---ArrayList<Integer> l1=new ArrayList<>(100);
l1.add(1);.....l1.add(100);
l1.add(101);//capa=150 --as per JVM spec.


2. add methods
boolean add(E e)  --- append 
void add(int index,E e) --- insert
void addAll(Collection<E> e) -- bulk append operation
eg : l1 --- AL<Emp>
l1.addAll(.....);
AL,LL,Vector --- legal
HS,TS,LHS --legal
HM,LHM,TM --illegal --javac error


2.5 Retrieve elem from list 
E get(int index)
index ranges from ---0 ---(size-1)
java.lang.IndexOutOfBoundsException

3. display list contents using --- toString


4. Attaching Iterator
Collection<E> interface method -- implemented by ArrayList
Iterator<E> iterator()
---places iterator BEFORE 1st element ref.
Iterator<E> i/f methods 
boolean hasNext() -- rets true if there exists next element, false otherwise.

E next() --- returns the element next to iterator position

void remove() -- removes last returned element from iterator.

Limitation --- type forward only & can start from 1st elem only.

Regarding exceptions with Iterator/List
1. java.util.NoSuchElementException -- thrown whenever trying to access the elem beyond the size of list via Iterator/ListIterator
2. java.lang.IllegalStateException --- thrown whenever trying to remove elem before calling next().
3. java.util.ConcurrentModificationException-- thrown typically --- when trying to use same iterator/list iterator --after structrually modifying list(eg add/remove methods of list)
Above describes fail-fast behaviour of the Iterator/ListIterator

Exception while accessing element by index.

4. java.lang.IndexOutOfBoundsException -- thrown typically  -- while trying to access elem beyond size(0---size-1) --via get


6. Attaching for-each  = attaching implicit iterator.

Attaching ListIterator ---scrollable iterator or to beign iteration from a specific element -- List ONLY or list specific iterator.
ListIterator<E> listItearator() --places LI before 1st element
ListIterator<E> listItearator(int index) --places LI before specified index.



4. search for a particular element in list
boolean contains(Object o)

5. searching for 1st occurrence
use -- indexOf
int indexOf(Object o)
rets index of 1st occurrence of specified elem. Rets -1 if elem not found.
searching for last occurrence 
use -- lastIndexOf
int lastIndexOf(Object o)
rets index of last occurrence of specified elem. Rets -1 if elem not found.

5.5
E set(int index,E e)
Replaces old elem at spepcified index by new elem.
Returns old elem


6. remove methods
E remove(int index) ---removes elem at specified index & returns removed elem.

boolean  remove(Object o) --- removes element specified by argument , rets true -- if elem is removed or false if elem cant be removed.

Objectives in Integer list
0. Create ArrayList of integers & populate it.
1. check if element exists in the list.
2. disp index of 1st occurance of the elem
3. double values in the list --if elem val > 20
4. remove elem at the specified index
5. remove by elem. -- rets true /false.


NOTE : 
For searching or removing based upon primary key , in List Implementation classes --- All search/remove methods (contains,indexOf,lastIndexOf,remove(Object o)) -- based upon equals method(of type of List eg --Account/Customer/Emp....)
For correct working
1. Identify prim key & create overloaded constr using PK.
eg : public Emp(int id) { this.id=id;}

2. Using PK , override equals for content equality.

Usage eg : ArrayList<Emp> emps=new AL<>();
emps.add(e1);//id=10
emps.add(e2);//id=20
emps.add(e3);//id=30

int index=emps.indexOf(20);//int ---> Integer --> Object (Integer)
Integer i=new Integer(20); // javac 
//internally invokes equals : whose equals --Object | Integer | Emp | NOA
invokes equlas on Integer  class
i.equals(e1)  ---since it's incomptabile types --rets false
i.equals(e2)  ---since it's incomptabile types --rets false
i.equals(e3)  ---since it's incomptabile types --rets false
Thus : indexOf rets -1
sop(index);// -1

Solution : 
Emp e=new Emp(20);
int index=emps.indexOf(e);
//internally invokes equals : whose equals --Object | Integer | Emp | NOA
invokes equals on Emp class
e.equals(e1)  ---it's comptabile types BUT ids are different --rets false
e.equals(e2)  --- it's comptabile types --ids are SAME --rets true

Thus : indexOf rets 1
sop(index);// 1



Objective --- Create simple List(ArrayList) of Account & test complete API
1.1
Create Empty Arraylist of Accounts
1.2 Accept a/c info from user till user types "stop" & populate AL.
1.2.1 -- Display AL content using for-each
1.3 Accept account id & display summary or error mesg
1.4 Accept src id , dest id & funds transfer.
1.5 Accept acct id & remove a/c -- 
1.6 Apply interest on all saving a/cs
1.7 Sort accounts as per asc a/c ids.
1.8 Sort accounts as per desc a/c ids.
1.9 Sort a/cs as per creation date -- w/o touching UDT
2.0 Sort a/cs as per bal


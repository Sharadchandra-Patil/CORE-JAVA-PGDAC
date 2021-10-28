String class API
Important String class constructors
1.String(byte[] bytes) --- byte[] ----> String converter

2.String(char[] chars)   --- char[] ---> String converter

3.String (byte[] bytes,int offset,int len)  ---byte[] ----> String converter from the specified offset , specified len no of bytes will be converted.
eg . String s=new String(bytes,3,4);   --- String will contain bytes[3]----bytes[6]

4. String(char[] ch,int offset,int len)

5. String(String s)

String class methods --- to go through
charAt,compareTo,contains,copyValueOf,format,valueOf,getBytes,toCharArray,toLowerCase,indexOf,lastIndexOf,split,replace,startsWith,endsWith,length,intern


1.
boolean equals(Object o) ---- ret true iff 2 strings are having same contents (case sensitive)

About equals()
super class def. --- java.lang.Object
public boolean equals(Object o)
Rets true iff both refs(this & o) are equal i.e referring to the same object.

Sub-class developers MUST override equals for content-wise(depending on Object's state) comparison.



2. concat,charAt,indexOf,lastIndexOf,toUpperCase,toLowerCase,format,split

printf & Formatter class
Refer to java.util.Formatter class for formatting conversion details.

Imp ---

Formatting details
%c -- character
%b -- boolean
%h -- hex value of hashcode of obj ref.
%s -- string
%d -- int
%f,%g -- float/double
%x -- hex value
%n -- line separator
%tD  -- Date 
%tT  -- Time
%tc  -- Time stamp(date & Time)
%td-%1$tb-%1$tY -- can be applied to GC or Date. 

Date/Time Handling in Java

API
1. java.util.Date--- represents system date.
Constructor
1.Date() --- creates Date class instance representing system date.
2.Date(long msec) --- creates Date class instance representing date for msec elapsed after epoch(=1st Jan 1970)
---------------------
For parsing & formatting 
1. Create an instance of java.text.SimpleDateFormat
Constr : SimpleDateFormat(String pattern)
pre defined pattern
y --yr
MM -- month in digit(1-12)
MMM -- month in abbrevation
MMMM ---complete month name

h- Hour
m --minute
s -- second
eg : SDF sdf=new SimpleDateFormat("dd-MM-yyyy");


2. Parsing (use inherited API) string ----> Date
public Date parse(String s) throws ParseException

3. Formatting
public String format(Date d)



2. java.util.GregorianCalendar
month range --- 0-11
GregorianCalendar(int yr,int mon,int date);
GregorianCalendar(int yr,int mon,int date,int hr,int min,int sec);

2.5 How to find out current year ?
GregorianCalendar class API (inherited from Calendar class)
public int get(String fieldName)
eg :  gc.get(Calendar.YEAR);



3. Date/Time formatting via printf
%tc -- for complete timestamp(date & time)
%tD -- for date
%tT -- time 

Arguments --- Date, GregorianCalendar

static import syntax ---
eg -- import static java.util.Calendar.*;
or import static java.lang.System.*;

in such src   -  u can access directly static members of Calendar class or from 2nd statement u can directly use out.println("testing static imports!");

var-args
variable args syntax.--- Must be last arg in the method args.
Can use primitive type or  ref types.
Legal ---
void doStuff(int... x) {
	
 } // expects from 0 to many ints
Usage : ref.doStuff();
int[] ints={1,2,3,4};
ref.doStuff(ints);
ref.doStuff(20,34,56);

System.out.printf("%n");
// as parameters
void doStuff2(char c, int... x) { } // expects first a char,
// then 0 to many ints
void doStuff3(Animal... animal) { } // 0 to many Animals
invocations ---
ref.doStuff3();
Animal[] animals={new Cat(),new Dog(),new Horse()};
ref.doStuff3(animals);
ref.doStuff3(a1,a2,a3);

Illegal:
void doStuff4(int x...) { } // bad syntax
void doStuff5(int... x, char... y) { } // too many var-args
void doStuff6(String... s, byte b) { } // var-arg must be last




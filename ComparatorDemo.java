//Comparator 
import java.io.*;
import java.lang.*;
import java.util.*;

//A class to represent a Student
class Student
{
int rollNo;
String name, address;

public Student(int rollNo, String name, String address)
{
this.rollNo=rollNo;
this.name=name;
this.address=address;
}

public String toString()
{
return this.rollNo+" "+this.name+" "+this.address;
}

}

class SortByRollno implements Comparator<Student>
{
//Used by sorting in ascending order of roll number
public int compare(Student a, Student b)
{
return a.rollNo-b.rollNo;
}
}

class SortByName implements Comparator<Student>
{
//Used by sorting in ascending order of name
public int compare(Student a, Student b)
{
return a.name.compareTo(b.name);
}
}

public class ComparatorDemo
{
public static void main(String[] args)
{
ArrayList<Student> a=new ArrayList<Student>();
a.add(new Student(111, "Ravi", "Hyderabad"));
a.add(new Student(131, "Priya", "Bangalore"));
a.add(new Student(121, "Pradeep", "Chennai"));

System.out.println("Unsorted");
for(int i=0; i<a.size(); i++)
System.out.println(a.get(i));

Collections.sort(a, new SortByRollno());
System.out.println("Sorted By Rollno");
for(int i=0; i<a.size(); i++)
System.out.println(a.get(i));

Collections.sort(a, new SortByName());
System.out.println("Sorted By Name");
for(int i=0; i<a.size(); i++)
System.out.println(a.get(i));
}
}




//Linked List Iterator
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorsDemo
{
public static void main(String[] args)
{
LinkedList<Integer> a=new LinkedList<Integer>();

for(int i=0;i<10;i++)
a.add(i);
System.out.println(a);

//At beginning itr(cursor) will point to index just before the first element in a
ListIterator itr=a.listIterator();

//Checking the next element availability
while(itr.hasNext())
{
//Moving cursor to next element
int i=(Integer)itr.next();

//Getting even elements one by on
System.out.print(i+" ");

//Changing odd numbers to even and adding modified number
if (i%2!=0)
{
i++; //Change to odd
itr.set(i); //Set method to change value
itr.add(i); //to add
}
}

System.out.println();
System.out.println(a);
}
}

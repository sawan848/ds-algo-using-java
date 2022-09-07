# String Builder

     A mutable sequence of characters. This class provides an API compatible with StringBuffer, but with no guarantee of synchronization. 
     This class is designed for use as a drop-in replacement for StringBuffer in places where the string buffer was being used by a single thread (as is generally the case). 
    Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster under most implementations. The principal operations on a 
    StringBuilder are the append and insert methods, which are overloaded so as to accept data of any type. Each effectively converts a given datum to a string and
    then appends or inserts the characters of that string to the string builder. The append method always adds these characters at the end of the builder; 
    the insert method adds the characters at a specified point. For example, if z refers to a string builder object whose current contents are "start", 
    then the method call z.append("le") would cause the string builder to contain "startle", whereas z.insert(4, "le") would alter the string builder to contain "starlet".
     In general, if sb refers to an instance of a StringBuilder, then sb.append(x) has the same effect as sb.insert(sb.length(), x).
     Every string builder has a capacity. As long as the length of the character sequence contained in the string builder does not exceed the capacity, 
    it is not necessary to allocate a new internal buffer. If the internal buffer overflows, it is automatically made larger.
    Instances of StringBuilder are not safe for use by multiple threads. If such synchronization is required then it is recommended that StringBuffer be used.
    Unless otherwise noted, passing a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.
    API Note:
    StringBuilder implements Comparable but does not override equals. Thus, the natural ordering of StringBuilder is inconsistent with equals.
    Care should be exercised if StringBuilder objects are used as keys in a SortedMap or elements in a SortedSet. See Comparable, SortedMap, or SortedSet for more information.
<hr>

```mermaid
classDiagram
Serializable <|-- StringBuilder : implements 
Comparable~StringBuilder~<|-- StringBuilder : implements 
CharSequence<|-- StringBuilder : implements 
AbstractStringBuilder-- o StringBuilder : extends
 ```

## Constructor
| Name                              | Description                                                                                                                                                                                       |
|-----------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| StringBuilder()                   | <p>Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument</p>                                                                            |
| StringBuilder(int capacity)       | <p> constructs a string builder initialized to the contents of the specified string. The initial capacity of the string builder is 16 plus the length of the string argument</p>                  |
| StringBuilder(String str)         | <p>Constructs a string builder that contains the same characters as the specified CharSequence. The initial capacity of the string builder is 16 plus the length of the CharSequence argument</p> |
 | StringBuilder(CharSequence chars) | <p>Compares two StringBuilder instances lexicographically. This method follows the same rules for lexicographical comparison as defined in the CharSequence.compare(this, another) method.</p>    |


## Methods

| Return Type   | Name                                                         | Description | Example |
|---------------|--------------------------------------------------------------|-------------|---------|
| int           | compareTo(StringBuilder another)                             |||
| int           | length()                                                     |||
| int           | indexOf(String str)                                          |||
| int           | indexOf(String str, int fromIndex)                           |||
| int           | lastIndexOf(String str)                                      |||
| int           | lastIndexOf(String str, int fromIndex)                       |||
| char          | charAt(int index)                                            |||
| char          | charAt(int index)                                            |||
| char          | charAt(int index)                                            |||
| String        | toString()                                                   |||
| String        | substring(int start)                                         |||
| String        | substring(int start,int end)                                 |||
| String        | substring(int start,int end)                                 |||
| StringBuilder | <a href="#append">append(String str)          </a>           |||
| StringBuilder | <a href="#insert"> insert(int index, char[] str, int offset,int len)       </a>     |||
| StringBuilder | reverse()                                                    |||
| StringBuilder | replace(int start, int end, String str)                      |||
| StringBuilder | deleteCharAt(int index)                                      |||
| StringBuilder | delete(int start, int end)                                   |||
| StringBuilder | appendCodePoint(int codePoint)                               |||
| StringBuilder | append(String obj)                                           |||
| Void          | getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) |||
| Void | setCharAt(int index,char ch)                                 |||
|Void| trimToSize()                                                 |||
|IntStream| chars()                                                      |||

<hr>

# append

| Return Type   | Name                                              | Description | Example |
|---------------|---------------------------------------------------|-------------|---------|
| StringBuilder | append(String obj)                                |||
| StringBuilder | append(String str)                                |||
| StringBuilder | append(StringBuffer sb)                           |||
| StringBuilder | append(CharSequence s)                            |||
| StringBuilder | append(CharSequence s, int start, int end)        |||
| StringBuilder | append(char[] str, int offset, int len)           |||
| StringBuilder | append(boolean b)                                 |||
| StringBuilder | append(char c)                                    |||
| StringBuilder | append(int i)                                     |||
| StringBuilder | append(long lng)                                  |||
| StringBuilder | append(float f)                                   |||
| StringBuilder | append(double d)                                  |||
| StringBuilder | insert(int index, char[] str, int offset,int len) |||
| StringBuilder | insert( int offset,Object obj)                    |||


# insert


|Return Type|Name|Description|Example|
|-----|----|-----|----|
| StringBuilder |  insert(int index, char[] str, int offset,int len)      |||
| StringBuilder | insert( int offset,Object obj)                               |||
| StringBuilder | insert( int offset,String str)                               |||
| StringBuilder | insert(int offset,char []str)                                |||
| StringBuilder | insert(int dstOffset, CharSequence s)                        |||
| StringBuilder | insert(int dstOffset, CharSequence s,int start, int end)     |||
| StringBuilder | insert(int offset, boolean b)                                |||
| StringBuilder | insert(int offset, char c)                                   |||
| StringBuilder | insert(int offset, int i)                                    |||
| StringBuilder | insert(int offset, long l)                                   |||
| StringBuilder | insert(int offset, float f)                                  |||
| StringBuilder | insert(int offset, double d)                                 |||

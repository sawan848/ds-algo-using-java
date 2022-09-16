# StringBuffer
    A thread-safe, mutable sequence of characters. A string buffer is like a String, but can be modified.

    String buffers are safe for use by multiple threads. The methods are synchronized.
    the insert method adds the characters at a specified point.
    For example, if z refers to a string buffer object whose current contents are "start", 
    then the method call z.append("le") would cause the string buffer to contain "startle", 
    whereas z.insert(4, "le") would alter the string buffer to contain "starlet".
    In general, if sb refers to an instance of a StringBuffer, then sb.append(x) has the same effect as sb.insert(sb.length(), x).

    Whenever an operation occurs involving a source sequence (such as appending or inserting from a source sequence),
    this class synchronizes only on the string buffer performing the operation, not on the source. Note that while 
    StringBuffer is designed to be safe to use concurrently from multiple threads, if the constructor or 
    the append or insert operation is passed a source sequence that is shared across threads, the calling code must ensure that 
    the operation has a consistent and unchanging view of the source sequence for the duration of the operation. 
    This could be satisfied by the caller holding a lock during the operation's call, by using an immutable source sequence, or 
    by not sharing the source sequence across threads. Every string buffer has a capacity. As long as the length of the 
    character sequence contained in the string buffer does not exceed the capacity, it is not necessary to allocate a new 
    internal buffer array. If the internal buffer overflows, it is automatically made larger.Unless otherwise noted, passing 
    a null argument to a constructor or method in this class will cause a NullPointerException to be thrown.As of release JDK 5,
    this class has been supplemented with an equivalent class designed for use by a single thread, StringBuilder. 
    The StringBuilder class should generally be used in preference to this one, as it supports all of the same operations but
    it is faster, as it performs no synchronization.API Note:
    
* *  StringBuffer implements Comparable but does not override equals.  
* *  the natural ordering of StringBuffer is inconsistent with equals. 

<hr>

```mermaid
classDiagram
Serializable <|-- StringBuffer : implements 
Comparable~StringBuffer~<|-- StringBuffer : implements 
CharSequence<|-- StringBuffer : implements 
AbstractStringBuilder<|-- StringBuffer : extends
 ```

## Constructor

| Name                                                                                                                                                                   | Description                      |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------|
| Constructs a string buffer with no characters in it and an initial capacity of 16 characters                                                                           | StringBuffer()                   |
| Constructs a string buffer with no characters in it and the specified initial capacity                                                                                 | StringBuffer(int capacity)       |
| Constructs a string buffer initialized to the contents of the specified string. The initial capacity of the string buffer is 16 plus the length of the string argument | StringBuffer(String str)         |
| Constructs a string buffer that contains the same characters as the specified CharSequence. The initial capacity of the string buffer is 16 plus the length of the CharSequence argument.                                                                                                                                                                    | StringBuffer(CharSequence chars) |

<hr>

## Methods

| Return type                        | Name                                                                | Description                                                                                                 | Example                                                                                                                                                                                                                                                                                                       |
|------------------------------------|---------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| int                                | length()                                                            | The number of  string in the buffer                                                                         | String str="main tenu fir milange"<br/> StringBuffer buffer =new StringBuffer(str);<br/>  int length=buffer.length();                                                                                                                                                                                         |
| int                                | capacity()                                                          | The initial capacity( is 16 characters) and appeared string length                                          | int capacity=buffer.capacity()                                                                                                                                                                                                                                                                                |
| int                                | indexOf(String str)                                                 | it return the starting index number of that string                                                          | int indexOf=buffer.indexOf("tenu");<br/> int indexOf=buffer.indexOf("m");                                                                                                                                                                                                                                     |
| int                                | lastIndexOf(String str)                                             | it return the last index of that string                                                                     | int lastIndexOf=buffer.lastIndexOf("e");                                                                                                                                                                                                                                                                      |
| int                                | indexOf(String str, int fromIndex)                                  | it return the starting index number of that string from the given index number                              | int indexOf=buffer.indexOf("e",8);<br/>  int indexOf=buffer.indexOf("e",0);                                                                                                                                                                                                                                   |
| int                                | lastIndexOf(String str, int fromIndex)                              | it return the last index of that string from the given index number                                         | int lastIndexOf=buffer.lastIndexOf("e",12);  <br/>  int lastIndexOf=buffer.lastIndexOf("e",20)                                                                                                                                                                                                                |
| int                                | compareTo(StringBuffer another)                                     | Compares two instances lexicographically. This method follows the same rules for lexicographical comparison | StringBuffer buffer1=new StringBuffer("a")<br/> StringBuffer buffer2=new StringBuffer("a")<br/> buffer1.compareTo(buffer2) == 0 <br/> StringBuffer buffer2=new StringBuffer("ab")<br/> StringBuffer buffer2=new StringBuffer("a")<br/> buffer1.compareTo(buffer2) ==1<br/>buffer2.compareTo(buffer1)==12<br/> |
| int                                | codePointAt(int index)                                              | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| int                                | codePointBefore(int index)                                          | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| int                                | codePointCount(int beginIndex, int endIndex)                        | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| int                                | offsetByCodePoints(int index, int codePointOffset)                  | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| char                               | charAt(int index)                                                   | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| String                             | substring(int start)                                                | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| String                             | substring(int start, int end)                                       | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| <a href="#append">StringBuffer</a> | <a href="#append"> append(Object obj)</a>                           | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| StringBuffer                       | <a href="#index"> insert(int index, char[] str, int offset,int len) | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| StringBuffer                       | replace(int start, int end, String str)                             | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| StringBuffer                       | reverse()                                                           | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |
| StringBuffer                       | getBytes(byte[] dst, int dstBegin, byte coder)                      | The append method always adds these characters at the end of the buffer                                     |                                                                                                                                                                                                                                                                                                               |




# append

| Return type  | Name                                       | Description                                                             | Example |
|--------------|--------------------------------------------|-------------------------------------------------------------------------|---------|
| StringBuffer | append(Object obj)                         | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(String str)                         | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(StringBuffer sb)                    | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(AbstractStringBuilder asb)          | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(CharSequence s)                     | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(CharSequence s, int start, int end) | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(char[] str)                         | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(char[] str, int offset, int len)    | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(boolean b)                          | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(char c)                             | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(int i)                              | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(long lng)                           | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(float f)                            | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | append(double d)                           | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | appendCodePoint(int codePoint)             | The append method always adds these characters at the end of the buffer |         |

<hr>

## index

| Return type  | Name                                                     | Description                                                             | Example |
|--------------|----------------------------------------------------------|-------------------------------------------------------------------------|---------|
| StringBuffer | insert(int index, char[] str, int offset,int len)        | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int offset, Object obj)                           | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int offset, String str)                           | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int offset, char[] str)                           | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int dstOffset, CharSequence s)                    | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int dstOffset, CharSequence s,int start, int end) | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int offset, boolean b)                            | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int offset, char c)                               | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int offset, int i)                                | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int offset, long l)                               | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int offset, float f)                              | The append method always adds these characters at the end of the buffer |         |
| StringBuffer | insert(int offset, double d)                             | The append method always adds these characters at the end of the buffer |         |




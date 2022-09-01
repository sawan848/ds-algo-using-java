# String

<style>
    b{
        color:yellow;
    }
    i{
        color:pink;
        font-weight:bold
    }
    e{
        color:#00e600
    }
    o{
        color:red;
    }
</style>

| Return Type         | Name                                         | Description                                                              | Example                                                                                                                                                        |
|---------------------|----------------------------------------------|--------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| --                  | <b> String(String s)</b>                     | Create a string with the same name                                       | <e>String s=new String("Hello")</e>                                                                                                                            |
| --                  | <b> String(char []str)  </b>                 | Create a string that represents with <br/>the same sequence of character | <e>char []str={'H','e','l','l','o'} <br> String s=new String(str) </e>                                                                                         |
| <i>int</i>          | <b>length()</b>                              | no of characters                                                         | <e>int length=s.length()</e>                                                                                                                                   | 
| <i>int</i>          | <b>indexOf(String pattern)</b>               | index of occurrence of pattern                                           | <e>String str="Good morning"; str.indexOf("m")</e><br/><o>output: 5</o>                                                                                        | 
| <i>int</i>          | <b>indexOf(String pattern,int fromIndex)</b> | index of occurrence pattern  after index                                 | <e>String str="Hello Planet";<br/> str.indexOf("e",5)</e><br/><o>Output:10</o>                                                                                 | 
| <i>int</i>          | <b>compareTo(String toStr)</b>               |  Result is negative, zero, or positive depending on the lexicographical ordering of the String and the argument. Uppercase and lowercase are not equal!                                                                         |                                                                                                                                                                | 
| <i>int</i>          | <b>hashcode()</b>                            | an integer hashcode                                                      | <e>str.hashcode()</e>                                                                                                                                          |              
| <i>char</i>         | <b>charAt(int i)   </b>                      | the character at index i                                                 | <e>char carAt=s.charAt(2)</e>                                                                                                                                  |             
| <i>char[]</i>       | <b>toCharArray()   </b>                      | convert the string to array                                              | <e>char []str=str.toCharArray()</e>                                                                                                                            |
| <i>String</i>       | <b>subString(int i,int j) </b>               | character at indices  i through (j-1)                                    | <e>String sbstr=s.substring(2,5)</e><br/> <o>output: llo </o>                                                                                                  |
| <i>String</i>       | <b>concat(String t)</b>                      | concatenate string                                                       | <e>String str="World" <br/> String str2=s.concat(str)   </e> <br/><o>str2=HelloWorld</o>                                                                       |
| <i>String</i>       | <b>toLowerCase() </b>                        | convert lower case letter                                                | <e>String sbstr=s.toLowerCase()</e>                                                                                                                            |
| <i>String</i>       | <b>toUpperCase()</b>                         | convert upper case letter                                                | <e>String str=s.toUpperCase() </e>                                                                                                                             |
| <i>String</i>       | <b>replace(String a,String b) </b>           | a is replaced by b                                                       | <e>String sbstr=s.substring(2,5)</e><br/> <o>output: llo </o>                                                                                                  |
| <i>String</i>       | <b>trim()</b>                                | this string leading and trailing whitespace removed                      | <e>String str="World" <br/> String str2=s.concat(str)   </e> <br/><o>str2=HelloWorld</o>                                                                       |
| <i>String[]</i>     | <b>split(String delimiter) </b>              | split string between occurrence of delimiter                             | <e>String sbstr=s.substring(2,5)</e><br/> <o>output: llo </o>                                                                                                  |
| <i>String</i>       | <b>valueOf(int a)</b>                        | return the string representation of specific value                       | <e>String str="World" <br/> String str2=s.concat(str)   </e> <br/><o>str2=HelloWorld</o>                                                                       |
| <i>CharSequence</i> | <b>subSequence(int i,int j)   </b>           | subsequence of string                                                    | <e>CharSequence chSequence=s.subSequence(2,4)                                                                                                                  |
| <i>boolean</i>      | <b>contains(String substring)</b>            | does this string contains substring                                      | <e> s.contains(s.substring(2,4)) <br> String str="Good morning"; str.contains("ing") <br/><o>str:true</o> <br/> str.contains("llo")<br/> <o>str:false</o> </e> |
| <i>boolean</i>      | <b>startWith(String prefix)</b>              | does this string start with prefix                                       ||
| <i>boolean</i>      | <b>endWith(String postfix)</b>               | does this string start with postfix                                      ||
| <i>boolean</i>      | <b>matches(String regexp)</b>                | is this matched by the regexp                                            ||
| <i>boolean</i>      | <b>equal(Object obj) </b>                    | is string value the same as it is                                        ||


## compareTo
    Sting comparison   it permits order comparisons in addition to simple equality comparisons, and
    it is generic f the compareTo method is similar to that of equals: Compares this object with the specified object for order.
    Returns a negative
    integer, zero, or a positive integer as this object is less than, equal to, or greater
    than the specified object 


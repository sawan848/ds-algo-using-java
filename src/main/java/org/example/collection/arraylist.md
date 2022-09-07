# ArrayList

# Constructor
| Name                                 | Description |
|--------------------------------------|-------------|
| ArrayList(int initialCapacity)       | ---         |
| ArrayList()                          | --          |
| ArrayList(Collection<? extends E> c) | --          |


```mermaid
classDiagram
Serializable <|-- ArrayList : implements 
List~E~<|-- ArrayList : implements 
Cloneable<|-- ArrayList : implements 
AbstractList<|-- ArrayList : extends
 ```


# methods
| Return Type  | Name                                         | Description            | Example |
|--------------|----------------------------------------------|------------------------|---------|
| int          | size()                                       | --                     | ---     | 
| int          | indexOf(Object o)                            | --                     | ---     | 
| int          | lastIndexOf(Object o)                        | --                     | ---     | 
| int          | hashCode()                                   | --                     | ---     | 
| boolean      | equals(Object o)                             | --                     | ---     | 
| boolean      | contains(Object o)                           | --                     | ---     | 
| boolean      | <a href="#add"> add(E e)</a>                 | --                     | ---     |
| boolean      | add(E e, Object[] elementData, int s)        | --                     | ---     |
| boolean      | addAll(Collection<? extends E> c)            | --                     | ---     |
| boolean      | addAll(int index, Collection<? extends E> c) | --                     | ---     |
| void         | add(int index, E element)                    | --                     | ---     |
| E            | set(int index, E element)                    | --                     | ---     |
| E            | get(int index)                               | --                     | ---     |
| E            | elementAt(Object[] es, int index)            | --                     | ---     |
| Object       | clone()                                      | --                     | ---     |
| boolean      | remove(Object o)                             | --                     | ---     |
| boolean      | removeAll(Collection<?> c)                   | --                     | ---     |
| boolean      | retainAll(Collection<?> c)                   | --                     | ---     |
| void         | clear()                                      | --                     | ---     |
| T[]          | toArray(T[] a)                               | --                     | ---     |
| ListIterator | listIterator(int index)                      | --                     | ---     |
| ListIterator | listIterator()                               | --                     | ---     |
| Iterator     | iterator()                                   | --                     | ---     |
| List<E>      | List<E> subList(int fromIndex, int toIndex)  | --                     | ---     |
| void         | trimToSize()                                 | --                     | ---     |
| void         | sort(Comparator<? super E> c)                             | --                     | ---     |
|  Object[] | grow(int minCapacity)                        | --          | ---     |


### Iterator

| Return Type | Name                                         | Description | Example |
|-------------|----------------------------------------------|-------------|---------|
| boolean     | hasNext()                                    | --          | --      |
| E           | next()                                       | --          | --      |
| void        | remove()                                     | --          | --      |
| void        | forEachRemaining(Consumer<? super E> action) | --          | --      |


### ListIterator

```mermaid
classDiagram
ListIterator~E~ <|-- ListItr : implements 
Itr<|-- ListItr : extends 
 ```

| Return Type | Name            | Description | Example |
|-------------|-----------------|-------------|---------|
| boolean     | hasPrevious()   | --          | --      |
| int         | nextIndex()     | --          | --      |
| int         | previousIndex() | --          | --      |
| E           | previous()      | --          | --      |
| void        | set(E e)        | --          | --      |
| void        | add(E e)        | --          | --      |

### SubList

```mermaid
classDiagram
RandomAccess~E~ <|-- SubList~E~ : implements 
AbstractList<|-- SubList : extends 
 ```


| Return Type     | Name                                         | Description | Example |
|-----------------|----------------------------------------------|-------------|---------|
| int             | size()                                       | ---         | ---     |
| int             | hashCode()                                   | ---         | ---     |
| int             | indexOf(Object o)                            | ---         | ---     |
| int             | lastIndexOf(Object o)                        | ---         | ---     |
| int             | contains(Object o)                           | ---         | ---     |
| int             | nextIndex()                                  | ---         | ---     |
| int             | previousIndex()                              | ---         | ---     |
| boolean         | addAll(Collection<? extends E> c)            | ---         | ---     |
| boolean         | addAll(int index, Collection<? extends E> c) | ---         | ---     |
| boolean         | equals(Object o)                             | ---         | ---     |
| void            | add(int index, E element)                    | ---         | ---     |
| void            | remove()        | ---         | ---     |
| void            | replaceAll(UnaryOperator<E> operator)        | ---         | ---     |
| boolean         | removeAll(Collection<?> c)                   | ---         | ---     |
| boolean         | retainAll(Collection<?> c)                   | ---         | ---     |
| boolean         | removeIf(Predicate<? super E> filter)        | ---         | ---     |
| E               | set(int index, E element)                    | ---         | ---     |
| E               | get(int index)                               | ---         | ---     |
| E               | remove(int index)                            | ---         | ---     |
| ListIterator<E> | listIterator(int index)                      | ---         | ---     |
| Object[]        | toArray()                                    | ---         | ---     |
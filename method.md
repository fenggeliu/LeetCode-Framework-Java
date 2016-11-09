//Primitives
	//Numbers
		return primitive xxx 
			.xxxValue(); Xxx.parseXxx(String s /*, int radix*/); Math.abs(obj); Math.max(arg1, arg2); Math.min(arg1, arg2)
			
		return int 
				compareTo(); Math.round(obj);
		return double
				Math.ceil(obj); Math.floor(obj); Math.rint(obj); Math.random();
		return boolean 
				.equals(obj);
		return Tobject 
				Xxx.valueOf(obj); 
		return String 
				Xxx.toString(obj) .toString();
		return null
				.toString();
//Character
		return boolean
			Character.isLetter(ch);
			Character.isDigit(ch);
			Character.isWhitespace(ch);
			Character.isLowerCase/isUppercase(ch);
		return char
			Character.toUpperCase/toLowercase(ch);
		return String
			Character.toString(ch)
//Array
		Arrays.sort(Object[] a); Arrays.fill(int[] a, int val);
		return boolean 
			Arrays.equals(long[] a, long[] b)
		return int 
			Arrays.binarySearch(Object[] a, Object key)
//String
	//String s
		return int
			.length(); .compareTo(str2); .compareToIgnoreCase(str2); .indexOf(ch/*,int fromIndex*/); .lastIndexOf(ch); lastIndexOf(str2); .matches(String regex);
		return char
			.charAt(int i); .toCharArray()
		return boolean
			.contentEquals(sb); .endsWith(str2); .equals(str2); .equalsIgnoreCase(str2);
		return String
			.copyValueOf(char[] data/*,int offset, int count*/); 
			.substring(int fromIndex, int endIndex);
			trim(); .toLowerCase(); .toUpperCase();
			string1.concat(string2); string1 + string2
			String.format(“%f, %d, %s”, floatVar, intVar, stringVar)
			.replace(ch1, ch2); .replaceAll/replaceFirst(String regex, Str2);
	//Stringbuilder sb
		StringBuilder sb = new StringBuilder(“contents”);
		sb.toString(); sb.reverse(); sb.
		sb.append(String s); sb.delete(int start, int end); sb.insert(int offset, obj); sb.replace(int start, int end, String s)
//Collection
	//List and Sets
		.size(); .isEmpty(); .clear(); 
		.add(tobject); .contains(object); .remove(object); 
		.containsall(coll); .addall(coll); .removeall(coll); .retainall(coll);
		//Views 
		.sublist( fromIndex, toIndex );
	//List<T> -- abstract class
		Collections.shuffle(list); Collections.reverse(list); Collections.sort(list);
		.add(index, obj); .remove(index); .indexOf(obj);
		//ArrayList<T>
			List<T> list = new ArrayList<>();
			.get(index); .set(index, obj);
		//LinkedList<T>
			List<T> list = new LinkedList<>();
			.getFirst(); .getLast(); .removeFirst(); .removeLast(); 
			.addFirst(obj); .addLast(obj);
	//Set<T> 
		//Hashset
			HashSet <T> hs = new HashSet<>();
		//Treeset
			TreeSet<T> set = new Treeset();
			//Views 
			.subset(fromElement, toElement); .headSet(toElement); .tailSet(fromElement);
		//Enumset
			EnumSet.of( e1, e2, e3); 
			EnumSet.range(e1, e2);
			EnumSet.complementOf(eset);
			EnumSet.allOf(E.class); Enumset.noneOf(E.class)
//Map
	Map<T,S>
	Map<T,S> map = new Map<T.S>();
	.size(); .isEmpty(); .clear(); 
	.get(key); .put(key, value); .remove(key); .containsKey(key); .containsValue(value);
	.putAll(map2);
	//Views 
	.keySet(); .values(); .entrySet(); .subMap/headMap/tailMap(fromKey, toKey)
	//HashMap<T,S>
		//TreeMap<T.S>
	//HashTable
		.clear(); .rehash(); 
		return object
			.clone(); .toString();
		return boolean
			.contains(value)

//Data Structures
	//Vector
		//Stack
			return Object
			.empty(); .peek(); .pop(); .push(obj);
			.search(obj)
	//Enumeration

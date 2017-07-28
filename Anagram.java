    static boolean isAnagram(String a, String b) {
        // Complete the function
   Boolean retValue = false;
   if(a != null && b != null) {
       char [] arrayA = a.toLowerCase().toCharArray();
       char [] arrayB = b.toLowerCase().toCharArray();
       Arrays.sort(arrayA);
       Arrays.sort(arrayB);
       retValue = Arrays.equals(arrayA, arrayB);
   }
       return retValue; 
    }

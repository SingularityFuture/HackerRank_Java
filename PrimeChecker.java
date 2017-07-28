import static java.lang.System.in;

class Prime {    
    public void checkPrime(int... args){
        for(int number:args){
            if (BigInteger.valueOf(number).isProbablePrime(1)) {
                System.out.print(number + " ");
            }          
        }
        System.out.println();
    }
}

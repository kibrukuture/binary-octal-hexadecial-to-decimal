 static int isSquare(int n){
     int valid=0;
     if(n<0) return valid;//n must be a positive integer.
     for(int i=0;i<n;i++){
         if(i*i==n) {
             valid = 1;
             break;//if found early , just break out of the loop.
         }
     }
     return valid;
}
static int isLegalNumber(int[ ] a, int base){
     int valid=1;
     for( int i=0;i<a.length;i++){
         if(a[i]>base || a[i]<0) valid=0;// digits in array "a" should be between 0(included) and base(excluded).
     }
     return valid;
}
static int convertToBase10(int[ ] a, int base){
     int tot=0;
     if(isLegalNumber(a,base)==1){
         for(int i=0;i<a.length;i++){
             tot+=a[a.length-1-i]*Math.pow(base,i);
     }
     }
     return tot;
}

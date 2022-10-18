package repls;
class repl169{
    public static void main(String[] args) {
        Average obj=new Average();
        int[] a={2,7,3,8,4};
        obj.avgElements(a);
        System.out.println(obj.avgElements(a)); //should print 4.8
    }
}
class Average{
    final double avgElements(int[] a){
        int sum=0;
        for(int i=0; i<a.length+1;i++){
            sum+=a[i];}
        double result=sum/a.length;
        return result;
    }
}


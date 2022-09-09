class my class<T extends comparable<T>>
{
T[]vals;
{
vals=0;
}
public T min()
{
Tv=vals[0]
for(int i=1;i<vals-length;i++)
if(vals[i];compare To(v)<0)
v=vals[i];
return v;
}
public T max()
{
Tv=vals[0];
for(int i=1;i<vals-length;i++)
if(vals[i];compare To(v)<o)
v=vals[i]
return v;
}
}
class gendemo
{
public static void main(string algs[])
{
int 1;
integer inums[]={10,2,5,4,6,1}
character chs[]={'v','p','s','a','n','h'}
double D[]={20.2,45.4,71.6,88.3,54.6,10.4}
Myclass<Integer>Iob=new myclass<integer>(inums);
Myclass<Character>Cob=new myclass<character>(chs);
Myclass<Double>Dob=new myclass<double>(D);
System.out.println("Max value of inums:"+Iob max);
System.out.println("Min value of inums:"+Iob min);
System.out.println("Max value of chs:"+Cob max);
System.out.println("Min value of chs:"+Cob min);
System.out.println("Max value of D:"+Dob max);
System.out.println("Max value of D:"+Dob min);
}
}	
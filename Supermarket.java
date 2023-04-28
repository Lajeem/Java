class Supermarket
{
    public static void main(String args[])
      {
        Supermarket obj=new Supermarket();
        int add=obj.shopping();
        System.out.println("veg_total=" + add);

        int add1=obj.shopping2();
        System.out.println("gocery_total="+add1);

        int add3=obj.addition( add,add1);
        System.out.println("total="+ add3);

        int sub=obj.subtraction(add3);
        System.out.println("discount="+sub);


        
       }
            public int shopping()
            {
            int carrot=20;
            int onion=30;
            int tomato=80;
            int potato=40;
            int beans=70;
            int add_total1= carrot+onion+tomato+potato+beans;
            return add_total1;
            }
            
            public int shopping2()
            {
            int soap=15;
            int oil=60;
            int maida=52;
            int rice=68;
            int rava=47;
            int add_total2= soap+oil+maida+rice+rava;
            return add_total2;
            }
            
            public int addition(int add_total1, int add_total2)
            {
            int addition=(add_total1+ add_total2);
             
            return addition;
            }             
            
            public int subtraction(int addition)
            {        
            int subtraction=(addition-5);
            return subtraction;
            }
}














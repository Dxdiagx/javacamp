package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1=new Person("Samet","Acar",1);
        Feature feature1 = new Feature("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                1,
                "2 ay sürecek ücretsiz ve " +
                        "profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.");


        Feature feature2 = new Feature("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT) ",
                2,
                "2 ay sürecek ücretsiz ve " +
                        "profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.");

        Feature feature3 = new Feature("Programlamaya Giriş İçin Temel Kurs",
                3,
                "PYTHON, JAVA, C# gibi tüm programlama dilleri için " +
                        "temel programlama mantığını anlaşılır örneklerle öğrenin.");

        Feature[] features = {feature1,feature2,feature3};
        for (Feature feature : features) {
            System.out.print(feature.id+" :  ");
            System.out.println(feature.name);
        }
Category category1=new Category();
        category1.id=1;
        category1.name="Programlama";

Category category2=new Category();
category2.id=2;
category2.name="TÜMÜ";
RollCall rollCall=new RollCall();
rollCall.rollcall(person1);

    }

}
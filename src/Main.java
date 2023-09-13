public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = "+dog+", cat = "+cat+" and paper = "+paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Now dog = "+dog+", cat = "+cat+" and paper = "+paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Then dog = "+dog+", cat = "+cat+" and paper = "+paper);

        var friend = 19;
        System.out.println("Friend = "+friend);
        friend = friend + 2;
        System.out.println("Now friend = "+friend);
        friend = friend / 7;
        System.out.println("And then friend = "+friend);

        var frog = 3.5;
        System.out.println("frog = "+frog);
        frog = frog * 10;
        System.out.println("Now frog = "+frog);
        frog = frog / 3.5;
        System.out.println("And then frog = "+frog);
        frog = frog + 4;
        System.out.println("Finally frog = "+frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var generalWeight = boxer1 + boxer2;
        System.out.println("First boxer's weight is "+boxer1+" kg, second boxer's weight is "+boxer2+
                " kg. Their general weight is "+generalWeight+" kg");
        var weightDifference = boxer1 - boxer2;
        System.out.println("Weight difference is "+weightDifference+" kg");

        weightDifference = boxer2 - boxer1;
        System.out.println("Boxers' weight difference is "+weightDifference+"kg");
        weightDifference = weightDifference % generalWeight;
        System.out.println("And again their weight difference is "+weightDifference);

        var generalHours = 640;
        var oneWorkerHours = 8;
        var workers = generalHours / oneWorkerHours;
        System.out.println("Всего работников в компании - "+workers+" человек");

        workers = workers + 94;
        var workHours = generalHours / workers;
        System.out.println("Если в компании рабтает "+workers+" человек, то всего "+workHours+
                " часа работы может быть поделено между сотрудниками");
    }
}

abstract class Cshape {
    public int number;
    public int totalangle;

    public abstract void angle();

    public String toString() {
        return "正" + number + "邊形每一角為" + (totalangle / number) + "度";
    }

}

class Ctriangle extends Cshape {
    public void angle() {
        number = 3;
        totalangle = (number - 2) * 180;
    }
}

class Crect extends Cshape {
    public void angle() {
        number = 4;
        totalangle = (number - 2) * 180;
    }
}

class Cpentagon extends Cshape {
    public void angle() {
        number = 5;
        totalangle = (number - 2) * 180;
    }
}

public class j15 {
    public static void main(String[] args) {
        Cshape objarr[] = new Cshape[3];
        objarr[0] = new Ctriangle();
        objarr[1] = new Crect();
        objarr[2] = new Cpentagon();
        for (int i = 0; i < objarr.length; i++) {
            objarr[i].angle();
        }
        for (int i = 0; i < objarr.length; i++) {
            System.out.println(objarr[i].toString());
        }
    }
}

public class nomina {

    public static void main(String[] args) {
       
        double[] sueldos = {150, 250, 120, 500, 320, 290, 199, 80, 280, 150};
        double acsueldo = 0;
        int cont = 0;

        for (double sueldo : sueldos) {
            if (sueldo > 0) { 
                
                acsueldo += sueldo;
                
                
                if (sueldo >= 100 && sueldo <= 300) {
                    cont++;
                }
            } else {
                System.out.println("Sueldo negativo " + sueldo);
            }
        }

        
        System.out.println("Cantidad de sueldos en el rango de 100 a 300: " + cont);
        System.out.println("Acumulado de sueldos " + (float) acsueldo);
           

    }
}
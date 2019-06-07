/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 * @author JOSE
 */
public class nuevo_areglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //marjan es de la ciudad de loja, su sueldo es 900.1 listado de trabajadores

        //ASIGNACION DE VALORES MEDIANTE LISTADO DE ARREGLOS
        String[] listaNombres = {"Marjan", "Jhon", "Rodrigo", "Miguel", "José"};
        String[] listaCiudades = {"Loja", "Catamayo", "Calvas", "Celica", "Pindal"};
        double[] listaSueldos = {900.1, 100.2, 450.3, 1500.2, 861.9};
        System.out.println("   LISTADO DE TRABAJADORES  \n");
        
        //ORDEN LOS VALORES DADOS SEGUN EL AUMENTO DEL CONTADOR 
        for (int i = 0; i < listaNombres.length; i++) {
            /*System.out.printf("Nombre: %s\n",listaNombres[i]);
             System.out.printf("Ciudad: %s\n",listaCiudades[i]);
             System.out.printf("Sueldo: %s\n",listaSueldos[i]);*/
            /*System.out.printf(" %s\n", listaNombres[i], "es de: "
             + "%s", listaCiudades[i], "y su sueldo es de: %f", listaSueldos[i]);*/
            
            //PRESENTACION POR INTERACION DEL COMADO FOR
            System.out.printf(" %s.  Es de: %s y su sueldo es de: "
                    + "%.2f\n", listaNombres[i], listaCiudades[i], listaSueldos[i]);

        }
    }

}

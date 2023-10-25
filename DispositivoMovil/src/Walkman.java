public class Walkman extends DispositivoMovil{

    private String cancionActual;

    public Walkman(){
        super(0);
    }

    public void reproducirCancion (String cancion){
        this.cancionActual = cancion;
        System.out.println("Reproduciendo la canción:" + cancion);
        }
    public void pausarCancion() {
        if (cancionActual != null) {
            System.out.println("Pausando la canción: " + cancionActual);
        } else {
            System.out.println("No se está reproduciendo ninguna canción.");
     }
  }
}
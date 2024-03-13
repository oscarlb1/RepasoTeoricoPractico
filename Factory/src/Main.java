public class Main {
    public static void main(String[] args) {
      alumnoFactory factory = new alumnoFactory();

      Alumnos Marcos = factory.presentarAlumno(Alumnos.Marcos);
        if(Marcos!= null){
          Marcos.saludar();
        }
      Alumnos Oscar = factory.presentarAlumno("Oscar");
        if(Oscar!= null){
            Oscar.saludar();
        }
      Alumnos Miguel = factory.presentarAlumno("Miguel");
        if(Miguel!= null){
            Miguel.saludar();
        }
    }
}
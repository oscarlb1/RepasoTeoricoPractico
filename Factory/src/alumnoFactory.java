public class alumnoFactory {
    public Alumnos presentarAlumno(String nombre){
        switch (nombre){
            case "Marcos":
                return new Marcos();
            case "Oscar":
                return new Oscar();
            case "Miguel":
                return new Miguel();
            default:
                return null;
        }
    }
}

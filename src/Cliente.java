public class Cliente {
    private
        String nombre;
        String apellidos;
        String dni;
        String direccion;
        String telefono;
        String email;

    public Cliente(String nombre, String apellidos, String dni, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.direccion = "";
        this.telefono = "";
        this.email = "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion
                + ", telefono=" + telefono + ", email=" + email + "]";
    }
}

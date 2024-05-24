package U8.Entregable2324;

public class Main {
    public static void main(String[] args) {

            ProcessPosts processPosts = new ProcessPosts();


            String filename = "C:\\Users\\DAW_M\\Desktop\\Programacion_Entregable\\programacion_23_24\\ejercicios\\src\\main\\java\\U8\\Entregable2324\\posts.xml";
            processPosts.parseDOM(filename);


            Post Post1 = new Post("El Nuevo titulo del post", "miejemploparaentregable.com/nuevo-post", "Hola muy buenas", "2024-05-24T01:00:00", "EntregableU8");
            
            processPosts.addPost(Post1);


            processPosts.convertToJSON();





    }
}


package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FileUploadEvent;

@ManagedBean
@SessionScoped
public class ImagenBean implements Serializable {

    private String imagen;

    public ImagenBean() {
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public void uploadFile(FileUploadEvent event){
        try{
            String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/resources/img");
            String archivo = path + File.separator + event.getFile().getFileName();
            
            FileOutputStream fileOutputStream = new FileOutputStream(archivo);
            byte[] buffer = new byte[6124];
            int bulk;
            InputStream inputStream = event.getFile().getInputstream();
            while (true) {
                bulk = inputStream.read(buffer);
                if (bulk < 0) {
                    break;
                }
                fileOutputStream.write(buffer,0,bulk);
                fileOutputStream.flush();
            } 
            fileOutputStream.close();
            inputStream.close();
            
            this.setImagen(event.getFile().getFileName());
            
        }catch (IOException e){
            e.printStackTrace();
        }        
    }
}

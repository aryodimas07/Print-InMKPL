package papb.learn.fauzan.printin.model;

import android.net.Uri;

public class UploadFileModel {
    private String namaFile,tipeFile,ukuranFile;

    Uri uriFile;

    public String getNamaFile() {
        return namaFile;
    }

    public void setNamaFile(String namaFile) {
        this.namaFile = namaFile;
    }

    public String getTipeFile() {
        return tipeFile;
    }

    public void setTipeFile(String tipeFile) {
        this.tipeFile = tipeFile;
    }

    public String getUkuranFile() {
        return ukuranFile;
    }

    public void setUkuranFile(String ukuranFile) {
        this.ukuranFile = ukuranFile;
    }

    public Uri getUriFile() {
        return uriFile;
    }

    public void setUriFile(Uri uriFile) {
        this.uriFile = uriFile;
    }
}

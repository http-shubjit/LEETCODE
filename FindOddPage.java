import java.util.Scanner;

public class FindOddPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document[] docsArray = new Document[4];
        Document[] res = new Document[4];
        for (int i = 0; i < res.length; i++) {
            docsArray[i] = new Document();
            res[i] = new Document();
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print("Enter Id");
            docsArray[i].id = sc.nextInt();
            System.out.print("Enter Title");
            docsArray[i].title = sc.next();
            System.out.print("Enter FolderName");
            docsArray[i].folderName = sc.next();
            System.out.print("Enter Pages");
            docsArray[i].pages = sc.nextInt();
        }
        res = docsWithOddPages(docsArray);
        for (int i = 0; i < res.length; i++) {
            if (res[i].getTitle() != null)
                System.out.println(res[i].getId() + " " + res[i].getTitle() + " " + res[i].getFolderName() + " "
                        + res[i].getPages());
        }
    

    }

    public static Document[] docsWithOddPages(Document[] docsArray) {
        Document[] oddDocs = new Document[4];
        for (int i = 0; i < oddDocs.length; i++) {
            oddDocs[i] = new Document();
        }
         int k=0;
         for (int j = 0; j < docsArray.length; j++) {
             if (docsArray[j].pages % 2 != 0) {
                 oddDocs[k++] = docsArray[j];
             }
         }
         int p=oddDocs.length;
         for (int i = 0; i < p-1; i++) {
            for (int j = 0; j < p-i-1; j++) {
                if (oddDocs[j].id > oddDocs[j + 1].id) {
                    Document t = oddDocs[j];
                    oddDocs[j] = oddDocs[j + 1];
                    oddDocs[j + 1] = t;
              }  
            }
         }
        return oddDocs;
        
    }
    
}

class Document {
    int id,pages;
    String title, folderName;

    // Document() {
        
    // }

    // Document(int id, int pages, String title, String folderName) {
    //     this.id = id;
    //     this.title = title;
    //     this.pages = pages;
    //     this.folderName = folderName;
    // }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }
   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
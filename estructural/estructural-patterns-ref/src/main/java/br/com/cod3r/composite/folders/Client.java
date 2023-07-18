package br.com.cod3r.composite.folders;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cod3r.composite.folders.model.FileSystemItem;
import br.com.cod3r.composite.folders.model.Folder;

// TODO: Composite review
/*
	- O padrão composite possui como intenção a composição de objetos em estruturas de árvore para representarem 
	hierarquias partes-todo. Permite aos clientes tratarem de mandeira uniforme objetos individuais e composições de objetos.
	- Para um entendimento mais acurado da intenção desse padrão, podemos tomar como exemplo as pastas e arquivos de um gerenciador
	de arquivos em um sistema operacional. Para o cliente, é possível mover, deletar, copiar ambos, etc, sem se preocupar
	se se trata de uma pasta ou um arquivo. São operações comuns às ambas entidades.
	- Isso pode ser alcançado quando essas duas classes, arquivos e pastas, implementam uma interface em comum, por exemplo,
	a interface 'FileSystem', que permite com que todas essas operações incidam sobre elas e/ou suas composições.
*/

public class Client {

	public static FileSystemItem createCompositeFromFile(File file) {
		if(!file.isDirectory()) return new br.com.cod3r.composite.folders.model.File(file.getName());
		List<FileSystemItem> childs = new ArrayList<>();
		File[] files = file.listFiles();
		for(File javaFile: files) {
			childs.add(createCompositeFromFile(javaFile));
		}
		return new Folder(file.getName(), childs);
	}
	
	public static void main(String[] args) {
		FileSystemItem file1 = new br.com.cod3r.composite.folders.model.File("File1.txt");
		FileSystemItem file2 = new br.com.cod3r.composite.folders.model.File("File2.txt");
		FileSystemItem file3 = new br.com.cod3r.composite.folders.model.File("File3.txt");
		FileSystemItem file4 = new br.com.cod3r.composite.folders.model.File("File4.txt");
		FileSystemItem sf1 = new Folder("sf1", Arrays.asList(file1));
		FileSystemItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
		FileSystemItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));
		
		folder.print("");
		
		System.out.println("------------");
		
		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = createCompositeFromFile(new File(dir + File.separator + "src"));
		fromDisk.print(">");
	}
}

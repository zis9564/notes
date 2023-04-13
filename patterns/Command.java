interface TextFileOperation {
    String execute();
}

class OpenTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    // constructors

    @Override
    public String execute() {
        return textFile.open();
    }
}

class SaveTextFileOperation implements TextFileOperation {

    // same field and constructor as above

    @Override
    public String execute() {
        return textFile.save();
    }
}

class TextFile {

    private String name;

    // constructor

    public String open() {
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }

    // additional text file methods (editing, writing, copying, pasting)
}

class TextFileOperationExecutor {

    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }
}

class CommandPatternMain {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile("file1.txt"))));
        textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile("file2.txt"))));
    }
}
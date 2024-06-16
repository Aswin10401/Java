// Custom exception class
class FileProcessingException extends Exception {
    public FileProcessingException(String errorMessage) {
        super(errorMessage);
    }
}

// FileProcessor class (example usage)
class FileProcessor {
    public void processFile(String fileName) throws FileProcessingException {
        if (fileName == null || fileName.isEmpty()) {
            throw new FileProcessingException("Invalid file name: " + fileName);
        }
        // Process the file (placeholder logic)
        System.out.println("Processing file: " + fileName);
    }
}

// Main program
public class CustomExceptionExample {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor();

        try {
            // Simulate processing with an invalid file name
            fileProcessor.processFile(null);
        } catch (FileProcessingException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        // Rest of the program...
    }
}

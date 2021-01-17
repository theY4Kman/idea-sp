package org.idea_sp;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class SourcePawnFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(SourcePawnFileType.INSTANCE, "sp");
        fileTypeConsumer.consume(SourcePawnFileType.INSTANCE, "inc");
    }
}

package org.idea_sp

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class SourcePawnFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(SourcePawnFileType.INSTANCE, "sp");
        consumer.consume(SourcePawnFileType.INSTANCE, "inc");
    }
}
package org.idea_sp

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class SourcePawnFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(SourcePawnFileType, "sp");
        consumer.consume(SourcePawnFileType, "inc");
    }
}
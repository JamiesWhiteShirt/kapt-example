package kaptexample.processor;

import com.google.auto.service.AutoService;
import kaptexample.annotation.Interesting;
import java.util.*;
import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lkaptexample/processor/KtAnnotationProcessor;", "Ljavax/annotation/processing/AbstractProcessor;", "()V", "process", "", "annotations", "", "Ljavax/lang/model/element/TypeElement;", "roundEnv", "Ljavax/annotation/processing/RoundEnvironment;", "kapt-example-processor_main"})
@javax.annotation.processing.SupportedAnnotationTypes(value = {"kaptexample.annotation.Interesting"})
@javax.annotation.processing.SupportedSourceVersion(value = javax.lang.model.SourceVersion.RELEASE_8)
@com.google.auto.service.AutoService(value = javax.annotation.processing.Processor.class)
public final class KtAnnotationProcessor extends javax.annotation.processing.AbstractProcessor {
    
    @java.lang.Override()
    public boolean process(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends javax.lang.model.element.TypeElement> annotations, @org.jetbrains.annotations.NotNull()
    javax.annotation.processing.RoundEnvironment roundEnv) {
        return false;
    }
    
    public KtAnnotationProcessor() {
        super();
    }
}
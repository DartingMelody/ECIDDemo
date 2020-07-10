/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.oal.seaas.util;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.core.pattern.PatternConverter;
import weblogic.diagnostics.context.DiagnosticContextHelper;

@Plugin(name = "ECIDPatternConverter", category = PatternConverter.CATEGORY)
@ConverterKeys({"e"})
public final class ECIDPatternConverter extends LogEventPatternConverter {

    /**
     * Private constructor.
     * @param options options, may be null.
     */
    private ECIDPatternConverter(final String[] options) {
        super("ECID", "ecId");
    }

    /**
     * Obtains an instance of pattern converter.
     *
     * @param options options, may be null.
     * @return instance of pattern converter.
     */
    public static ECIDPatternConverter newInstance(final String[] options) {
        return new ECIDPatternConverter(options);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void format(final LogEvent event, final StringBuilder toAppendTo) {
        toAppendTo.append(DiagnosticContextHelper.getContextId());
    }
}

/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.sheets.stream;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class GoogleSheetsStreamEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":spreadsheetId";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(32);
        props.add("backoffMultiplier");
        props.add("majorDimension");
        props.add("range");
        props.add("initialDelay");
        props.add("scheduler");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("valueRenderOption");
        props.add("runLoggingLevel");
        props.add("maxResults");
        props.add("backoffErrorThreshold");
        props.add("greedy");
        props.add("clientSecret");
        props.add("scheduledExecutorService");
        props.add("applicationName");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("clientId");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("splitResults");
        props.add("exchangePattern");
        props.add("spreadsheetId");
        props.add("accessToken");
        props.add("backoffIdleThreshold");
        props.add("delay");
        props.add("pollStrategy");
        props.add("startScheduler");
        props.add("scopes");
        props.add("exceptionHandler");
        props.add("includeGridData");
        props.add("refreshToken");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("clientSecret");
        secretProps.add("accessToken");
        secretProps.add("refreshToken");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "google-sheets-stream".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "spreadsheetId", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.addon.deltaspike;

import org.jboss.forge.addon.projects.ProjectFacet;
import org.jboss.forge.furnace.versions.Version;

/**
 * 
 * 
 * 
 * @author <a href="mailto:rajmahendra@gmail.com">Rajmahendra Hegde</a>
 */
public interface DeltaSpikeFacet extends ProjectFacet {
    /**
     * Return the {@link Version} to identify which version this Facet supports.
     */
    public Version getVersion();
}

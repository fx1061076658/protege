package org.protege.editor.core.plugin;

import org.protege.editor.core.Disposable;
/*
 * Copyright (C) 2007, University of Manchester
 *
 *
 */


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: Mar 22, 2006<br><br>
 * <p/>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 * <p/>
 * The base interface for plugins.  This interface
 * has methods to manage the plugin life cycle.
 *
 * dispose() is called at the end of a plugin
 * life cycle, when the plugin needs to be removed
 * from the system.  Plugins should remove any listeners
 * that they setup and perform other cleanup, so that
 * the plugin can be garbage collected.
 *
 */
public interface ProtegePluginInstance extends Disposable {

    /**
     * The initialise method is called at the start of a
     * plugin instance life cycle.
     * This method is called to give the plugin a chance
     * to initialise itself.  All plugin initialisation
     * should be done in this method rather than the plugin
     * constructor, since the initialisation might need to
     * occur at a point after plugin instance creation, and
     * a each plugin must have a zero argument constructor.
     */
    public void initialise() throws Exception;
}

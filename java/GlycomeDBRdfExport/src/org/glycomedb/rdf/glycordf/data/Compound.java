package org.glycomedb.rdf.glycordf.data;

import java.util.ArrayList;
import java.util.List;

public class Compound extends Thing
{
    protected String m_instanceURI = null;
    protected boolean m_ontologyInstance = false;

    protected List<ResourceEntry> m_hasResourceEntry = new ArrayList<ResourceEntry>();
    protected List<ReferencedCompound> m_hasReference = new ArrayList<ReferencedCompound>();

    public Compound(){}
    
    public Compound(String a_uri)
    {
        this.setInstanceURI(a_uri);
    }

    public Compound(String a_uri, boolean a_isInstance)
    {
        this.setInstanceURI(a_uri);
        this.setOntologyInstance(a_isInstance);
    }

    public String getInstanceURI()
    {
        return this.m_instanceURI;
    }

    public void setOntologyInstance(boolean a_isInstance)
    {
        this.m_ontologyInstance = a_isInstance;
    }

    public boolean isOntologyInstance()
    {
        return this.m_ontologyInstance;
    }

    public void setInstanceURI(String instanceURI)
    {
        this.m_instanceURI = instanceURI;
    }

    public List<ResourceEntry> getHasResourceEntry()
    {
        return this.m_hasResourceEntry;
    }

    public void setHasResourceEntry(List<ResourceEntry> a_hasResourceEntry)
    {
        this.m_hasResourceEntry = a_hasResourceEntry;
    }

    public void addHasResourceEntry(ResourceEntry a_hasResourceEntry)
    {
        this.m_hasResourceEntry.add(a_hasResourceEntry);
    }
    public List<ReferencedCompound> getHasReference()
    {
        return this.m_hasReference;
    }

    public void setHasReference(List<ReferencedCompound> a_hasReference)
    {
        this.m_hasReference = a_hasReference;
    }

    public void addHasReference(ReferencedCompound a_hasReference)
    {
        this.m_hasReference.add(a_hasReference);
    }
}
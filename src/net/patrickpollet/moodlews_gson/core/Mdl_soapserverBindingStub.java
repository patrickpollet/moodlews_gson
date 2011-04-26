/**
 * Mdl_soapserverBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

/**
 * Modified for Gsonlibrary by pp@patrickpollet.net using GsonStubWriter
 */

package net.patrickpollet.moodlews_gson.core;

import java.lang.reflect.Type
import java.util.Collection
import java.util.List
import com.google.gson.reflect.TypeToken
import net.patrickpollet.gson.*;

public class Mdl_soapserverBindingStub extends  GsonBindingStubBase{
    public Mdl_soapserverBindingStub(String service_url, String nameSpace, boolean debug) {
         super(service_url,nameSpace,debug);
     }

    public net.patrickpollet.moodlews_gson.core.AssignmentRecord[] add_assignment(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.AssignmentDatum datum)  {
    final String METH_NAME = "add_assignment";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<AssignmentRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (AssignmentRecord[]) ret.toArray( new AssignmentRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CategoryRecord[] add_category(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.CategoryDatum datum)  {
    final String METH_NAME = "add_category";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CategoryRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CohortRecord[] add_cohort(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.CohortDatum datum)  {
    final String METH_NAME = "add_cohort";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CohortRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] add_course(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.CourseDatum coursedatum)  {
    final String METH_NAME = "add_course";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("coursedatum",coursedatum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.DatabaseRecord[] add_database(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.DatabaseDatum datum)  {
    final String METH_NAME = "add_database";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<DatabaseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (DatabaseRecord[]) ret.toArray( new DatabaseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ForumRecord[] add_forum(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.ForumDatum datum)  {
    final String METH_NAME = "add_forum";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ForumRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ForumRecord[]) ret.toArray( new ForumRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] add_group(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.GroupDatum datum)  {
    final String METH_NAME = "add_group";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupingRecord[] add_grouping(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.GroupingDatum datum)  {
    final String METH_NAME = "add_grouping";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupingRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.LabelRecord[] add_label(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.LabelDatum datum)  {
    final String METH_NAME = "add_label";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<LabelRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (LabelRecord[]) ret.toArray( new LabelRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord add_noneditingteacher(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "add_noneditingteacher";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.PageWikiRecord[] add_pagewiki(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.PageWikiDatum datum)  {
    final String METH_NAME = "add_pagewiki";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<PageWikiRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (PageWikiRecord[]) ret.toArray( new PageWikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.SectionRecord[] add_section(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.SectionDatum datum)  {
    final String METH_NAME = "add_section";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<SectionRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (SectionRecord[]) ret.toArray( new SectionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord add_student(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "add_student";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord add_teacher(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "add_teacher";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] add_user(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.UserDatum userdatum)  {
    final String METH_NAME = "add_user";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userdatum",userdatum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.WikiRecord[] add_wiki(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.WikiDatum datum)  {
    final String METH_NAME = "add_wiki";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<WikiRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (WikiRecord[]) ret.toArray( new WikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_assignment_to_section(int client, java.lang.String sesskey, int assignmentid, int sectionid, int groupmode)  {
    final String METH_NAME = "affect_assignment_to_section";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("assignmentid",assignmentid);
      envelope.addProperty("sectionid",sectionid);
      envelope.addProperty("groupmode",groupmode);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_course_to_category(int client, java.lang.String sesskey, int courseid, int categoryid)  {
    final String METH_NAME = "affect_course_to_category";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("categoryid",categoryid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_database_to_section(int client, java.lang.String sesskey, int databaseid, int sectionid)  {
    final String METH_NAME = "affect_database_to_section";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("databaseid",databaseid);
      envelope.addProperty("sectionid",sectionid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_forum_to_section(int client, java.lang.String sesskey, int forumid, int sectionid, int groupmode)  {
    final String METH_NAME = "affect_forum_to_section";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("forumid",forumid);
      envelope.addProperty("sectionid",sectionid);
      envelope.addProperty("groupmode",groupmode);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_group_to_course(int client, java.lang.String sesskey, int groupid, int courseid)  {
    final String METH_NAME = "affect_group_to_course";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("courseid",courseid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_group_to_grouping(int client, java.lang.String sesskey, int groupid, int groupingid)  {
    final String METH_NAME = "affect_group_to_grouping";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("groupingid",groupingid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_grouping_to_course(int client, java.lang.String sesskey, int groupingid, int courseid)  {
    final String METH_NAME = "affect_grouping_to_course";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupingid",groupingid);
      envelope.addProperty("courseid",courseid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_label_to_section(int client, java.lang.String sesskey, int labelid, int sectionid)  {
    final String METH_NAME = "affect_label_to_section";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("labelid",labelid);
      envelope.addProperty("sectionid",sectionid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_pageWiki_to_wiki(int client, java.lang.String sesskey, int pageid, int wikiid)  {
    final String METH_NAME = "affect_pageWiki_to_wiki";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("pageid",pageid);
      envelope.addProperty("wikiid",wikiid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_section_to_course(int client, java.lang.String sesskey, int sectionid, int courseid)  {
    final String METH_NAME = "affect_section_to_course";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("sectionid",sectionid);
      envelope.addProperty("courseid",courseid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_user_to_cohort(int client, java.lang.String sesskey, int userid, int groupid)  {
    final String METH_NAME = "affect_user_to_cohort";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("groupid",groupid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_user_to_course(int client, java.lang.String sesskey, int userid, int courseid, java.lang.String rolename)  {
    final String METH_NAME = "affect_user_to_course";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("rolename",rolename);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_user_to_group(int client, java.lang.String sesskey, int userid, int groupid)  {
    final String METH_NAME = "affect_user_to_group";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("groupid",groupid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.EnrolRecord[] affect_users_to_cohort(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String useridfield, java.lang.String cohortid, java.lang.String cohortidfield)  {
    final String METH_NAME = "affect_users_to_cohort";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("cohortid",cohortid);
      envelope.addProperty("cohortidfield",cohortidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<EnrolRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.EnrolRecord[] affect_users_to_group(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String useridfield, java.lang.String cohortid, java.lang.String cohortidfield)  {
    final String METH_NAME = "affect_users_to_group";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("cohortid",cohortid);
      envelope.addProperty("cohortidfield",cohortidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<EnrolRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord affect_wiki_to_section(int client, java.lang.String sesskey, int wikiid, int sectionid, int groupmode, int visible)  {
    final String METH_NAME = "affect_wiki_to_section";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("wikiid",wikiid);
      envelope.addProperty("sectionid",sectionid);
      envelope.addProperty("groupmode",groupmode);
      envelope.addProperty("visible",visible);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public int count_activities(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String courseid, java.lang.String courseidfield, int limit)  {
    final String METH_NAME = "count_activities";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("limit",limit);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return response.intValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return 0;
        }
   }
    public int count_users_bycourse(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield, int roleid)  {
    final String METH_NAME = "count_users_bycourse";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("roleid",roleid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return response.intValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return 0;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CohortRecord[] delete_cohort(int client, java.lang.String sesskey, java.lang.String id, java.lang.String idfield)  {
    final String METH_NAME = "delete_cohort";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CohortRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] delete_course(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield)  {
    final String METH_NAME = "delete_course";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] delete_group(int client, java.lang.String sesskey, java.lang.String id, java.lang.String idfield)  {
    final String METH_NAME = "delete_group";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupingRecord[] delete_grouping(int client, java.lang.String sesskey, java.lang.String id, java.lang.String idfield)  {
    final String METH_NAME = "delete_grouping";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupingRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] delete_user(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "delete_user";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AssignmentRecord[] edit_assignments(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.AssignmentDatum[] assignments)  {
    final String METH_NAME = "edit_assignments";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("assignments",_assignments);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<AssignmentRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (AssignmentRecord[]) ret.toArray( new AssignmentRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CategoryRecord[] edit_categories(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.CategoryDatum[] categories)  {
    final String METH_NAME = "edit_categories";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("categories",_categories);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CategoryRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] edit_courses(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.CourseDatum[] courses)  {
    final String METH_NAME = "edit_courses";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("courses",_courses);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.DatabaseRecord[] edit_databases(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.DatabaseDatum[] databases)  {
    final String METH_NAME = "edit_databases";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("databases",_databases);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<DatabaseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (DatabaseRecord[]) ret.toArray( new DatabaseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ForumRecord[] edit_forums(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.ForumDatum[] forums)  {
    final String METH_NAME = "edit_forums";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("forums",_forums);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ForumRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ForumRecord[]) ret.toArray( new ForumRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupingRecord[] edit_groupings(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.GroupingDatum[] groupings)  {
    final String METH_NAME = "edit_groupings";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("groupings",_groupings);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupingRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] edit_groups(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.GroupDatum[] groups)  {
    final String METH_NAME = "edit_groups";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("groups",_groups);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.LabelRecord[] edit_labels(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.LabelDatum[] labels)  {
    final String METH_NAME = "edit_labels";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("labels",_labels);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<LabelRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (LabelRecord[]) ret.toArray( new LabelRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.PageWikiRecord[] edit_pagesWiki(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.PageWikiDatum[] pageswiki)  {
    final String METH_NAME = "edit_pagesWiki";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("pageswiki",_pageswiki);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<PageWikiRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (PageWikiRecord[]) ret.toArray( new PageWikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.SectionRecord[] edit_sections(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.SectionDatum[] sections)  {
    final String METH_NAME = "edit_sections";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("sections",_sections);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<SectionRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (SectionRecord[]) ret.toArray( new SectionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] edit_users(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.UserDatum[] users)  {
    final String METH_NAME = "edit_users";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("users",_users);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.WikiRecord[] edit_wikis(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.WikiDatum[] wikis)  {
    final String METH_NAME = "edit_wikis";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("wikis",_wikis);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<WikiRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (WikiRecord[]) ret.toArray( new WikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.EnrolRecord[] enrol_students(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String idfield)  {
    final String METH_NAME = "enrol_students";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("userids",_userids);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<EnrolRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ForumDiscussionRecord[] forum_add_discussion(int client, java.lang.String sesskey, int forumid, net.patrickpollet.moodlews_gson.core.ForumDiscussionDatum discussion)  {
    final String METH_NAME = "forum_add_discussion";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("forumid",forumid);
      envelope.addProperty("discussion",discussion);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ForumDiscussionRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ForumDiscussionRecord[]) ret.toArray( new ForumDiscussionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ForumPostRecord[] forum_add_reply(int client, java.lang.String sesskey, int parenttid, net.patrickpollet.moodlews_gson.core.ForumPostDatum post)  {
    final String METH_NAME = "forum_add_reply";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("parenttid",parenttid);
      envelope.addProperty("post",post);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ForumPostRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ForumPostRecord[]) ret.toArray( new ForumPostRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ActivityRecord[] get_activities(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String courseid, java.lang.String courseidfield, int limit)  {
    final String METH_NAME = "get_activities";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("limit",limit);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ActivityRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ActivityRecord[]) ret.toArray( new ActivityRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AssignmentRecord[] get_all_assignments(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_assignments";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<AssignmentRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (AssignmentRecord[]) ret.toArray( new AssignmentRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CohortRecord[] get_all_cohorts(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_cohorts";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CohortRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.DatabaseRecord[] get_all_databases(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_databases";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<DatabaseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (DatabaseRecord[]) ret.toArray( new DatabaseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ForumRecord[] get_all_forums(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_forums";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ForumRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ForumRecord[]) ret.toArray( new ForumRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupingRecord[] get_all_groupings(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_groupings";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupingRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] get_all_groups(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_groups";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.LabelRecord[] get_all_labels(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_labels";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<LabelRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (LabelRecord[]) ret.toArray( new LabelRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.PageWikiRecord[] get_all_pagesWiki(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_pagesWiki";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<PageWikiRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (PageWikiRecord[]) ret.toArray( new PageWikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.QuizRecord[] get_all_quizzes(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_quizzes";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<QuizRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (QuizRecord[]) ret.toArray( new QuizRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.WikiRecord[] get_all_wikis(int client, java.lang.String sesskey, java.lang.String fieldname, java.lang.String fieldvalue)  {
    final String METH_NAME = "get_all_wikis";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("fieldname",fieldname);
      envelope.addProperty("fieldvalue",fieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<WikiRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (WikiRecord[]) ret.toArray( new WikiRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AssignmentSubmissionRecord[] get_assignment_submissions(int client, java.lang.String sesskey, int assignmentid, java.lang.String[] userids, java.lang.String useridfield, int timemodified, int zipfiles)  {
    final String METH_NAME = "get_assignment_submissions";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("assignmentid",assignmentid);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("timemodified",timemodified);
      envelope.addProperty("zipfiles",zipfiles);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<AssignmentSubmissionRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (AssignmentSubmissionRecord[]) ret.toArray( new AssignmentSubmissionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public boolean[] get_boolean_array()  {
    final String METH_NAME = "get_boolean_array";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
             return GsonUtils.getBooleanArray(response);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CategoryRecord[] get_categories(int client, java.lang.String sesskey, java.lang.String catid, java.lang.String idfield)  {
    final String METH_NAME = "get_categories";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("catid",catid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CategoryRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CategoryRecord[] get_category_byid(int client, java.lang.String sesskey, java.lang.String catid)  {
    final String METH_NAME = "get_category_byid";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("catid",catid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CategoryRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CategoryRecord[] get_category_byname(int client, java.lang.String sesskey, java.lang.String catname)  {
    final String METH_NAME = "get_category_byname";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("catname",catname);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CategoryRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CategoryRecord[]) ret.toArray( new CategoryRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CohortRecord[] get_cohort_byid(int client, java.lang.String sesskey, int groupid)  {
    final String METH_NAME = "get_cohort_byid";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CohortRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CohortRecord[] get_cohort_byidnumber(int client, java.lang.String sesskey, java.lang.String cohortIdNumber)  {
    final String METH_NAME = "get_cohort_byidnumber";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("cohortIdNumber",cohortIdNumber);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CohortRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_cohort_members(int client, java.lang.String sesskey, java.lang.String id, java.lang.String idfield)  {
    final String METH_NAME = "get_cohort_members";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("id",id);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CohortRecord[] get_cohorts_byname(int client, java.lang.String sesskey, java.lang.String cohortName)  {
    final String METH_NAME = "get_cohorts_byname";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("cohortName",cohortName);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CohortRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] get_course(int client, java.lang.String sesskey, java.lang.String info, java.lang.String idfield)  {
    final String METH_NAME = "get_course";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] get_course_byid(int client, java.lang.String sesskey, java.lang.String info)  {
    final String METH_NAME = "get_course_byid";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] get_course_byidnumber(int client, java.lang.String sesskey, java.lang.String info)  {
    final String METH_NAME = "get_course_byidnumber";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("info",info);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GradeRecord[] get_course_grades(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_course_grades";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GradeRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GradeRecord[]) ret.toArray( new GradeRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] get_courses(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield)  {
    final String METH_NAME = "get_courses";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] get_courses_bycategory(int client, java.lang.String sesskey, java.lang.String catid)  {
    final String METH_NAME = "get_courses_bycategory";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("catid",catid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] get_courses_search(int client, java.lang.String sesskey, java.lang.String search)  {
    final String METH_NAME = "get_courses_search";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("search",search);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.EventRecord[] get_events(int client, java.lang.String sesskey, int eventtype, java.lang.String ownerid, java.lang.String owneridfield)  {
    final String METH_NAME = "get_events";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("eventtype",eventtype);
      envelope.addProperty("ownerid",ownerid);
      envelope.addProperty("owneridfield",owneridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<EventRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (EventRecord[]) ret.toArray( new EventRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public float[] get_float_array(float n)  {
    final String METH_NAME = "get_float_array";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("n",n);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
             return GsonUtils.getFloatArray(response);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ForumDiscussionRecord[] get_forum_discussions(int client, java.lang.String sesskey, int forumid, int limit)  {
    final String METH_NAME = "get_forum_discussions";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("forumid",forumid);
      envelope.addProperty("limit",limit);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ForumDiscussionRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ForumDiscussionRecord[]) ret.toArray( new ForumDiscussionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ForumPostRecord[] get_forum_posts(int client, java.lang.String sesskey, int discussionid, int limit)  {
    final String METH_NAME = "get_forum_posts";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("discussionid",discussionid);
      envelope.addProperty("limit",limit);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ForumPostRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ForumPostRecord[]) ret.toArray( new ForumPostRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GradeRecord[] get_grades(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String[] courseids, java.lang.String courseidfield)  {
    final String METH_NAME = "get_grades";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("courseidfield",courseidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GradeRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GradeRecord[]) ret.toArray( new GradeRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] get_group_byid(int client, java.lang.String sesskey, int groupid)  {
    final String METH_NAME = "get_group_byid";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_group_members(int client, java.lang.String sesskey, java.lang.String groupid, java.lang.String groupidfield)  {
    final String METH_NAME = "get_group_members";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("groupidfield",groupidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] get_grouping_byid(int client, java.lang.String sesskey, int groupid)  {
    final String METH_NAME = "get_grouping_byid";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_grouping_members(int client, java.lang.String sesskey, java.lang.String groupid, java.lang.String groupidfield)  {
    final String METH_NAME = "get_grouping_members";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("groupidfield",groupidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupingRecord[] get_groupings_bycourse(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_groupings_bycourse";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupingRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] get_groupings_byname(int client, java.lang.String sesskey, java.lang.String groupname, int courseid)  {
    final String METH_NAME = "get_groupings_byname";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupname",groupname);
      envelope.addProperty("courseid",courseid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] get_groups_bycourse(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_groups_bycourse";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] get_groups_byname(int client, java.lang.String sesskey, java.lang.String groupname, int courseid)  {
    final String METH_NAME = "get_groups_byname";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupname",groupname);
      envelope.addProperty("courseid",courseid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ResourceRecord[] get_instances_bytype(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield, java.lang.String type)  {
    final String METH_NAME = "get_instances_bytype";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("type",type);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ResourceRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ResourceRecord[]) ret.toArray( new ResourceRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public int[] get_int_array(int n)  {
    final String METH_NAME = "get_int_array";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("n",n);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
             return GsonUtils.getIntegerArray(response);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ChangeRecord[] get_last_changes(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, int limit)  {
    final String METH_NAME = "get_last_changes";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("limit",limit);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ChangeRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ChangeRecord[]) ret.toArray( new ChangeRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ContactRecord[] get_message_contacts(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "get_message_contacts";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ContactRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ContactRecord[]) ret.toArray( new ContactRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.MessageRecord[] get_messages(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "get_messages";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<MessageRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (MessageRecord[]) ret.toArray( new MessageRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.MessageRecord[] get_messages_history(int client, java.lang.String sesskey, java.lang.String useridto, java.lang.String useridtofield, java.lang.String useridfrom, java.lang.String useridfromfield)  {
    final String METH_NAME = "get_messages_history";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("useridto",useridto);
      envelope.addProperty("useridtofield",useridtofield);
      envelope.addProperty("useridfrom",useridfrom);
      envelope.addProperty("useridfromfield",useridfromfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<MessageRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (MessageRecord[]) ret.toArray( new MessageRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GradeItemRecord[] get_module_grades(int client, java.lang.String sesskey, int activityid, java.lang.String activitytype, java.lang.String[] userids, java.lang.String useridfield)  {
    final String METH_NAME = "get_module_grades";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("activityid",activityid);
      envelope.addProperty("activitytype",activitytype);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GradeItemRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GradeItemRecord[]) ret.toArray( new GradeItemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GradeItemRecord[] get_my_assignment_grade(int client, java.lang.String sesskey, int assignmentid)  {
    final String METH_NAME = "get_my_assignment_grade";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("assignmentid",assignmentid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GradeItemRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GradeItemRecord[]) ret.toArray( new GradeItemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CohortRecord[] get_my_cohorts(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String idfield)  {
    final String METH_NAME = "get_my_cohorts";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CohortRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] get_my_courses(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String sort)  {
    final String METH_NAME = "get_my_courses";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("sort",sort);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] get_my_courses_byidnumber(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String sort)  {
    final String METH_NAME = "get_my_courses_byidnumber";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("sort",sort);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] get_my_courses_byusername(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String sort)  {
    final String METH_NAME = "get_my_courses_byusername";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("sort",sort);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] get_my_group(int client, java.lang.String sesskey, int uid, int idfield, java.lang.String courseid, java.lang.String courseidfield)  {
    final String METH_NAME = "get_my_group";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] get_my_groups(int client, java.lang.String sesskey, java.lang.String uid, java.lang.String idfield)  {
    final String METH_NAME = "get_my_groups";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("uid",uid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public int get_my_id(int client, java.lang.String sesskey)  {
    final String METH_NAME = "get_my_id";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return response.intValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return 0;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GradeItemRecord[] get_my_module_grade(int client, java.lang.String sesskey, int activityid, java.lang.String activitytype)  {
    final String METH_NAME = "get_my_module_grade";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("activityid",activityid);
      envelope.addProperty("activitytype",activitytype);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GradeItemRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GradeItemRecord[]) ret.toArray( new GradeItemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GradeItemRecord[] get_my_quiz_grade(int client, java.lang.String sesskey, int quizid)  {
    final String METH_NAME = "get_my_quiz_grade";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("quizid",quizid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GradeItemRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GradeItemRecord[]) ret.toArray( new GradeItemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public int get_primaryrole_incourse(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String courseid, java.lang.String courseidfield)  {
    final String METH_NAME = "get_primaryrole_incourse";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return response.intValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return 0;
        }
   }
    public net.patrickpollet.moodlews_gson.core.QuizRecord get_quiz(int client, java.lang.String sesskey, int quizid, java.lang.String format)  {
    final String METH_NAME = "get_quiz";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("quizid",quizid);
      envelope.addProperty("format",format);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (QuizRecord)GsonUtils.getObject(response,new QuizRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.FileRecord get_resourcefile_byid(int client, java.lang.String sesskey, int resourceid)  {
    final String METH_NAME = "get_resourcefile_byid";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("resourceid",resourceid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (FileRecord)GsonUtils.getObject(response,new FileRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ResourceRecord[] get_resources(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield)  {
    final String METH_NAME = "get_resources";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ResourceRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ResourceRecord[]) ret.toArray( new ResourceRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.RoleRecord[] get_role_byid(int client, java.lang.String sesskey, int roleid)  {
    final String METH_NAME = "get_role_byid";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("roleid",roleid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<RoleRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (RoleRecord[]) ret.toArray( new RoleRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.RoleRecord[] get_role_byname(int client, java.lang.String sesskey, java.lang.String rolename)  {
    final String METH_NAME = "get_role_byname";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("rolename",rolename);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<RoleRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (RoleRecord[]) ret.toArray( new RoleRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.RoleRecord[] get_roles(int client, java.lang.String sesskey, java.lang.String roleid, java.lang.String idfield)  {
    final String METH_NAME = "get_roles";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("roleid",roleid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<RoleRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (RoleRecord[]) ret.toArray( new RoleRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.SectionRecord[] get_sections(int client, java.lang.String sesskey, java.lang.String[] courseids, java.lang.String idfield)  {
    final String METH_NAME = "get_sections";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("courseids",_courseids);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<SectionRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (SectionRecord[]) ret.toArray( new SectionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public java.lang.String[] get_string_array()  {
    final String METH_NAME = "get_string_array";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
            return GsonUtils.getStringArray(response);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_students(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_students";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_teachers(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String idfield)  {
    final String METH_NAME = "get_teachers";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_user(int client, java.lang.String sesskey, java.lang.String userinfo, java.lang.String idfield)  {
    final String METH_NAME = "get_user";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userinfo",userinfo);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_user_byid(int client, java.lang.String sesskey, int userinfo)  {
    final String METH_NAME = "get_user_byid";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userinfo",userinfo);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_user_byidnumber(int client, java.lang.String sesskey, java.lang.String userinfo)  {
    final String METH_NAME = "get_user_byidnumber";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userinfo",userinfo);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_user_byusername(int client, java.lang.String sesskey, java.lang.String userinfo)  {
    final String METH_NAME = "get_user_byusername";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userinfo",userinfo);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GradeRecord[] get_user_grades(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String idfield)  {
    final String METH_NAME = "get_user_grades";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GradeRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GradeRecord[]) ret.toArray( new GradeRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_users(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String idfield)  {
    final String METH_NAME = "get_users";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("userids",_userids);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_users_bycourse(int client, java.lang.String sesskey, java.lang.String idcourse, java.lang.String idfield, int roleid)  {
    final String METH_NAME = "get_users_bycourse";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("idcourse",idcourse);
      envelope.addProperty("idfield",idfield);
      envelope.addProperty("roleid",roleid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] get_users_byprofile(int client, java.lang.String sesskey, java.lang.String profilefieldname, java.lang.String profilefieldvalue)  {
    final String METH_NAME = "get_users_byprofile";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("profilefieldname",profilefieldname);
      envelope.addProperty("profilefieldvalue",profilefieldvalue);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public boolean has_role_incourse(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String courseid, java.lang.String courseidfield, int roleid)  {
    final String METH_NAME = "has_role_incourse";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("roleid",roleid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return response.booleanValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return false;
        }
   }
    public net.patrickpollet.moodlews_gson.core.LoginReturn login(java.lang.String username, java.lang.String password)  {
    final String METH_NAME = "login";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("username",username);
      envelope.addProperty("password",password);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (LoginReturn)GsonUtils.getObject(response,new LoginReturn());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public boolean logout(int client, java.lang.String sesskey)  {
    final String METH_NAME = "logout";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return response.booleanValue();
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return false;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord message_send(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, java.lang.String message)  {
    final String METH_NAME = "message_send";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("message",message);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord remove_group_from_grouping(int client, java.lang.String sesskey, int groupid, int groupingid)  {
    final String METH_NAME = "remove_group_from_grouping";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("groupid",groupid);
      envelope.addProperty("groupingid",groupingid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord remove_noneditingteacher(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "remove_noneditingteacher";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord remove_student(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "remove_student";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord remove_teacher(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String userid, java.lang.String useridfield)  {
    final String METH_NAME = "remove_teacher";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord remove_user_from_cohort(int client, java.lang.String sesskey, int userid, int groupid)  {
    final String METH_NAME = "remove_user_from_cohort";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("groupid",groupid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord remove_user_from_course(int client, java.lang.String sesskey, int userid, int courseid, java.lang.String rolename)  {
    final String METH_NAME = "remove_user_from_course";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("rolename",rolename);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.AffectRecord remove_user_from_group(int client, java.lang.String sesskey, int userid, int groupid)  {
    final String METH_NAME = "remove_user_from_group";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("groupid",groupid);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      return (AffectRecord)GsonUtils.getObject(response,new AffectRecord());
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.EnrolRecord[] remove_users_from_cohort(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String useridfield, java.lang.String cohortid, java.lang.String cohortidfield)  {
    final String METH_NAME = "remove_users_from_cohort";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("cohortid",cohortid);
      envelope.addProperty("cohortidfield",cohortidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<EnrolRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.EnrolRecord[] remove_users_from_group(int client, java.lang.String sesskey, java.lang.String[] userids, java.lang.String useridfield, java.lang.String cohortid, java.lang.String cohortidfield)  {
    final String METH_NAME = "remove_users_from_group";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("userids",_userids);
      envelope.addProperty("useridfield",useridfield);
      envelope.addProperty("cohortid",cohortid);
      envelope.addProperty("cohortidfield",cohortidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<EnrolRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.ProfileitemRecord[] set_user_profile_values(int client, java.lang.String sesskey, java.lang.String userid, java.lang.String useridfield, net.patrickpollet.moodlews_gson.core.ProfileitemRecord[] values)  {
    final String METH_NAME = "set_user_profile_values";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("userid",userid);
      envelope.addProperty("useridfield",useridfield);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("values",_values);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<ProfileitemRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (ProfileitemRecord[]) ret.toArray( new ProfileitemRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.EnrolRecord[] unenrol_students(int client, java.lang.String sesskey, java.lang.String courseid, java.lang.String courseidfield, java.lang.String[] userids, java.lang.String idfield)  {
    final String METH_NAME = "unenrol_students";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("courseid",courseid);
      envelope.addProperty("courseidfield",courseidfield);
     //TODO generate an arraytype  for input array 
     envelope.addProperty("userids",_userids);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<EnrolRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (EnrolRecord[]) ret.toArray( new EnrolRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CohortRecord[] update_cohort(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.CohortDatum datum, java.lang.String idfield)  {
    final String METH_NAME = "update_cohort";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CohortRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CohortRecord[]) ret.toArray( new CohortRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.CourseRecord[] update_course(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.CourseDatum datum, java.lang.String courseidfield)  {
    final String METH_NAME = "update_course";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("courseidfield",courseidfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<CourseRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (CourseRecord[]) ret.toArray( new CourseRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupRecord[] update_group(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.GroupDatum datum, java.lang.String idfield)  {
    final String METH_NAME = "update_group";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupRecord[]) ret.toArray( new GroupRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.GroupingRecord[] update_grouping(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.GroupingDatum datum, java.lang.String idfield)  {
    final String METH_NAME = "update_grouping";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<GroupingRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (GroupingRecord[]) ret.toArray( new GroupingRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.SectionRecord[] update_section(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.SectionDatum datum, java.lang.String idfield)  {
    final String METH_NAME = "update_section";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("idfield",idfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<SectionRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (SectionRecord[]) ret.toArray( new SectionRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
    public net.patrickpollet.moodlews_gson.core.UserRecord[] update_user(int client, java.lang.String sesskey, net.patrickpollet.moodlews_gson.core.UserDatum datum, java.lang.String useridfield)  {
    final String METH_NAME = "update_user";
    MyHttpTransportSE httpTransport = this.makeHttpTransport();
     try {
	MyRestSerializationEnvelope envelope = this.makeEnvelope(METH_NAME);
      envelope.addProperty("client",client);
      envelope.addProperty("sesskey",sesskey);
      envelope.addProperty("datum",datum);
      envelope.addProperty("useridfield",useridfield);
       String response=httpTransport.call(METH_NAME, envelope);
	  this.logInfo(METH_NAME, response);
      Type  collectionType = new TypeToken<Collection<UserRecord>>(){}.getType();
        Collection ret=this.getList(response, collectionType);
        return (UserRecord[]) ret.toArray( new UserRecord[0]);
    } catch (Exception e) {
             this.logError(httpTransport, e);
           return null;
        }
   }
}

<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>DataDrivenTestSuite</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>dff84d07-4083-43e0-8d94-9da1551689f5</testSuiteGuid>
   <testCaseLink>
      <guid>40d7e975-e96f-433b-a4b4-8655fabf3afe</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>''</defaultValue>
         <description></description>
         <id>ab67ac47-6fba-42aa-83e2-20357ebb48dc</id>
         <masked>false</masked>
         <name>username</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/DataDrivenTestingDemo/TC_DataDrivenTesting</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>16d62a17-b63b-4206-8ed3-aee4094880e1</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/LoginData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>16d62a17-b63b-4206-8ed3-aee4094880e1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>ab67ac47-6fba-42aa-83e2-20357ebb48dc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>16d62a17-b63b-4206-8ed3-aee4094880e1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>650fcf97-21e1-49b2-81b8-9b985f3280e6</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>

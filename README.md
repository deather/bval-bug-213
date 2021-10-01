This code was written just to help understanding the bug [BVAl-213](https://issues.apache.org/jira/browse/BVAL-213)

## How to test

I created a shell script `run.sh` to help testing. It will install automatically a TomEE plus version which embeds bval 2.0.3.

Normally TomEE will start automatically in debug mode with the war installed. The bug is encountered when you navigate to the url `http://localhost:8080/bug-bval/helloWorld`. The stracktrace is visible in the standard output.

## How to debug

TomEE can be debug on the port `8000` by default. All library coming with TomEE are provided in the project with gradle.

## Location of file problem

I identified multiple files to understand or test the bug. See the bug report for the little explanation.

- `org.apache.bval.jsr.metadata.Liskov.StrengtheningIssue#test` the overriddenHierarchy value (line: 54)
- `org.apache.bval.jsr.metadata.HierarchyBuilder.forBean` (line: 315)

## How to test fix

If you want to try a custom version of bval, you have to replace the bval jar in the directory `apache-tomee-plus-8.0.8/lib`.

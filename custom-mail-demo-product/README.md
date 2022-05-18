# Custom Mail Demo

This demo shows how new task notification mails
and daily task summary mails can be customized by providing
own mail processes.

![Mail](mail.png)

Learn more about custom mail processes in our 
[documentation](https://developer.axonivy.com/doc/dev/designer-guide/user-interface/email-notifications/index.html)

## Demo

The process `mail` has two process start. One for the
new task mail notification and one for the daily task
summary mail. Feel free to take this demo as template
to implement your own mail processes.

![Mail Processes](processes.png)

## Setup

Deploy this demo project to an Axon Ivy Engine and
trigger the creation of a task. All responsible users
will get a new task notification mail with the content
of this standard process.

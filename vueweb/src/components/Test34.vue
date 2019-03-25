<template>
  <div id="test34">
    <button v-on:click="say('hi')">Say hi</button>
    <button v-on:click="say('what')">Say what</button>
    <div @click.ctrl="doSomething">Do something</div>
    <input @keyup.enter="doSome">
  </div>
</template>

<script>
    export default {
      methods: {
        say: function (message) {
          alert(message);
        },
        doSomething:function () {
          alert("do something");
        },
        doSome:function () {
          alert("do some");
        }
      }
    }
</script>

<style scoped>

</style>

<template>
  <div id="test35">
    <p>input 元素：</p>
    <input v-model="message" placeholder="编辑我……">
    <p>消息是: {{ message }}</p>

    <p>textarea 元素：</p>
    <p style="white-space: pre">{{ message2 }}</p>
    <textarea v-model="message2" placeholder="多行文本输入……"></textarea>
  </div>
</template>

<script>
    export default {
      data() {
        return {
          message: 'Runoob',
          message2: '菜鸟教程\r\nhttp://www.runoob.com'
        }
      }
    }
</script>

<style scoped>

</style>

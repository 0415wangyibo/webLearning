<template>
  <div id="test11">
    <div v-if="Math.random() > 0.5">
      Sorry
    </div>
    <div v-else>
      Not sorry
    </div>
  </div>
</template>

<script>
    export default {
        name: "test11"
    }
</script>

<style scoped>

</style>
